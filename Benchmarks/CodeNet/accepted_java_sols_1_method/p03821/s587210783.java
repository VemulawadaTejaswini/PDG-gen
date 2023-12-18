import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    // 整数の入力
    int N = sc.nextInt();
    long[] A = new long[N];
    long[] B = new long[N];
    int count = 0;
    for(int i = 0; i < N; i++){
       A[i] = sc.nextInt();
       B[i] = sc.nextInt();
    }

    long temp_dif;
    long temp_sum = 0;
    for(int i = N - 1; i >= 0; i--){
      A[i] += temp_sum;
      if( A[i] % B[i] != 0){

        temp_dif = B[i] - (A[i] % B[i]);
        temp_sum += temp_dif;
      }
    }


    System.out.println(temp_sum);
  }
}