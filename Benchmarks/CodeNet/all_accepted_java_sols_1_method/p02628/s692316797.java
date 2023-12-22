import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int k = sc.nextInt();
    
    int[] arr = new int[n];
    
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    
    Arrays.sort(arr);
    
    int sum = 0;
    for(int i=0;i<k;i++){
      sum+=arr[i];
    }
    System.out.println(sum);
  }
}

/*
5 3
50 100 80 120 80
*/
