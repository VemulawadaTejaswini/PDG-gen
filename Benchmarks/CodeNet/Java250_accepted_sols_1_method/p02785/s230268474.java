import java.util.Arrays;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int[] arr = new int[n];
    long sum = 0;

    for(int i=0;i<n;i++) {
      arr[i] = sc.nextInt();
    }
    Arrays.sort(arr);
    if(n<=k) {
      System.out.println(0);
    } else {
      for(int j=0;j<n-k;j++) {
        sum = sum + arr[j];
      }
    }
    if(sum>0) System.out.println(sum);
    }
  }
