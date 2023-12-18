import java.util.*;
public class Main {
	public static void main(String[] args){
       Scanner sc = new Scanner(System.in);   
      // 順列
	  int N = sc.nextInt();
      // Pnの値
      int[] P = new int[N];
      for(int i=0;i<N;i++){
        P[i] = sc.nextInt();
      }
      //カウント
      int count = 0;
      //比べる数で一番小さい数、初期値はP[0]
      int min = P[0];
      
      for(int i=0;i<N;i++){
        if(P[i]<=min){
          count++;
          //最小値はP[i]に変わる
          min=P[i];
        }
      }
      
      System.out.println(count);
    }
}