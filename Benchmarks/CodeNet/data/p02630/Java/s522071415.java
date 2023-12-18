import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Arrays;
import java.util.Collections;
import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int[] A = new int[N];
    for (int i = 0;i < N;i++) {
      A[i] = scan.nextInt();
    }
    int Q = scan.nextInt();
    int[] B = new int[Q];
    int[] C = new int[Q];
    for (int i = 0;i < Q;i++) {
      int sum = 0;
      B[i] = scan.nextInt();
      C[i] = scan.nextInt();
      for (int j = 0;j < N;j++) {
        if (A[j] == B[i]) {
          A[j] = C[i];
          sum += C[i];
        }
        else{
          sum += A[j];
        }
      }
      System.out.println(sum);
    }  
  }
}



