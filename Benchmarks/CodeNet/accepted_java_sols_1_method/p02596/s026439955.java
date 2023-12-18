import java.util.*;
  public class Main {
    public static void main(String[] args) {
     
        //sec--1 (definition)
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int[] A = new int[1000001];
        //配列Aの初期化
        A[0] = 7 % K;
        for (int i=1; i<=K; i++) {
         //A[i] += 7;
         A[i] = (A[i-1]*10 + 7) % K;
        }
          
        //sec--2 (loop)
        //A[i](7の倍数)がKの倍数<=>A[i](7の倍数)はKで割り切れる
        for (int i=0; i<=K; i++) {
        if(A[i] == 0){
         System.out.println(i+1);
         return;
        }
        }
         System.out.println(-1);
    }
  }