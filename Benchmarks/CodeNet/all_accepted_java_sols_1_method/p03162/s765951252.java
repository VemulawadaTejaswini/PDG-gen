import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {

      
 public static void main(String[] args) {
    
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int N = in.nextInt(); // Scanner has functions to read ints, longs, strings, chars, etc.
    int[][] arr = new int[N][3];
    //int[][3] dp = new int[N][3];
    int max = Integer.MIN_VALUE;
    
    for (int i = 0 ; i < N; ++i) {
        arr[i][0] = in.nextInt();
        arr[i][1] = in.nextInt();
        arr[i][2] = in.nextInt();
        
        if(i > 0) {
             arr[i][0] = Math.max(arr[i][0]+arr[i-1][1], arr[i][0]+arr[i-1][2]);
             arr[i][1] = Math.max(arr[i][1]+arr[i-1][0], arr[i][1]+arr[i-1][2]);
             arr[i][2] = Math.max(arr[i][2]+arr[i-1][0], arr[i][2]+arr[i-1][1]);
        }
       
        max = Math.max(Math.max(Math.max(max, arr[i][0]),arr[i][1]),arr[i][2]);
    }


    System.out.println(max);
  }
  
}