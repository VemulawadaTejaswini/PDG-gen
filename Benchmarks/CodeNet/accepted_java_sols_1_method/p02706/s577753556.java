import java.util.*;
import java.io.*;

public class Main {

 public static void main(String[] args) {
     
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int M = in.nextInt(); // Scanner has functions to read ints, longs, strings, chars, etc.
    int N = in.nextInt();
    int[] A = new int[M];
    long sum = 0;
    for(int i = 0; i < N; i++) {
        sum += in.nextInt();
    }
    
    if(sum > M) {
        System.out.println(-1);
    }
    else {
        System.out.println(M-sum);
    }
    
    
  }
  
}