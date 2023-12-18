/*
 * Click `Run` to execute the snippet below!
 */
 
import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //Intializing array and input
    int N = sc.nextInt();
    int arr[] = new int[N+2];
    arr[0] = 0;
    arr[N+1] = 0;
    for(int i = 1; i<=N; i++){
      arr[i] = sc.nextInt();
    }
    //Expression 1
    int total = 0;
    for(int i = 1; i<=N+1; i++){
      total += Math.abs(arr[i-1] - arr[i]);
    }
    //Outputing answers
    for(int i = 1; i<=N; i++){
      System.out.println(total - Math.abs(arr[i] - arr[i-1]) - Math.abs(arr[i+1] - arr[i]) + Math.abs(arr[i+1] - arr[i-1])); 
    }
  }
}
