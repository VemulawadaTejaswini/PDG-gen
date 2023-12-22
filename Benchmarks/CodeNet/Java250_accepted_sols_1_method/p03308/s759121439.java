import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int[] A = new int[n];

    for(int i = 0; i < n; i++)
      A[i] = scan.nextInt();

    int min = A[0];
    int max = A[0];
    for(int i = 1; i < n; i++){
      min = Math.min(min, A[i]);
      max = Math.max(max, A[i]);
    }

    System.out.println(max - min);
  }
}
