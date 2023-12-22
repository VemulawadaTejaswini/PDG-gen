import java.util.*;
public class Main {
	public static void main(String[] args){
       Scanner sc = new Scanner(System.in);   
       //取得
      int N = sc.nextInt();
      int m = sc.nextInt();
      int[] M = new int[30];
      for(int i=0;i<N;i++){
        int K = sc.nextInt();
        int[] A = new int[K];
        for(int j=0;j<K;j++){
          A[j] = sc.nextInt();
          M[A[j]-1]++;
        }
      }
      int count=0;
      for(int i=0;i<30;i++){
        if(M[i]==N){
          count++;
        }
      }
      System.out.println(count);
    }
}