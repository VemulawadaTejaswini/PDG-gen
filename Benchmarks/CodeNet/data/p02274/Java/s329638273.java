import java.util.*;
import java.io.*;
class Main{
  static int count =0;
  static int n=0;
  public static void main(String args[])throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    n = Integer.parseInt(br.readLine());
    String str [] = br.readLine().split("\\s+");
    int array [] = new int[n];
    for(int i = 0; i<n; i++){
      array[i] = Integer.parseInt(str[i]);
    }
    Inversions(array);
    System.out.println(count);
  }
  //TLE
  // static void Inversions(int A[]){
  //   for(int i = 0; i<n-1; i++){
  //     for(int j = i+1;j<n;j++){
  //         if(A[i]>A[j])count++;
  //     }
  //   }
  // }
  static void Inversions(int A[]){
    int max = 0;
    int max_n = 0;
    int prev = 99999;
    for(int j =0; j<A.length;j++){
      max = 0;

      max_n = 0;
      for(int i = 0; i < A.length; i++){
        if(max<A[i]&&prev>A[i]){
          max = A[i];
          max_n=i;
        }
      }
      for(int i = max_n+1; i <A.length; i++){
        if(A[i]<max)count++;
      }
      prev = A[max_n];
    }
  }
}

