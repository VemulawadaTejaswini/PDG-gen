import java.util.*;
import java.io.*;
class Main{
  static  int max = 0;
  static int n;
  public static void main(String args[])throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    n = Integer.parseInt(br.readLine());
    short A[] = new short[n];
    String s[] = br.readLine().split("\\s+");
    for(int i = 0; i<n; i++){
      A[i] = (short)Integer.parseInt(s[i]);
      if(max<A[i])max = A[i];
    }
    A = sort(A);
    for(int i = 0; i<n; i++){
      if(i>0)System.out.print(" ");
      System.out.print(A[i]);
    }
    System.out.println();

  }
  static short [] sort(short A[]){
    short C[] = new short[max+1];
    short B[] = new short[n];
    for(int i = 0; i<n; i++){
      C[A[i]]++;
    }
    for(int i = 1; i<=max; i++){
      C[i] = (short)(C[i] + C[i-1]);
    }
    for(int i = n-1; i>-1; i--){
      B[C[A[i]]-1] =A[i];
      C[A[i]]--;
    }
    return B;
  }
}
