import java.util.Scanner;
import java.util.Arrays;

class Main {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int[] sequence = new int[n];

    for ( int i = 0; i < sequence.length; i++ ) {
      sequence[i] = sc.nextInt();
    }
    System.out.println(findLISLen(sequence));
  }

  public static int findLISLen(int[] sequence) {
      
    // lens[i] refers among all subsequences with len i
    // the index of smallest ending value of them
    int maxLen = 0, newL = 0;
    int[] lens = new int[sequence.length+1];

    for ( int i = 0; i < sequence.length; i++ ) {
        
        // binary search
        int lo = 1, hi = maxLen;
        while ( lo <= hi ) {
          int mid = lo+(hi-lo)/2;
          if ( sequence[lens[mid]] <= sequence[i] ) {
            lo = mid+1; 
          } else {
            hi = mid-1;
          }
        }

        newL = lo;
        lens[newL] = i;
        maxLen = Math.max(maxLen, newL);
    }
    return maxLen;
  }
  
} 