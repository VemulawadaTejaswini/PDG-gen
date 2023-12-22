import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();  //人数
      int K = sc.nextInt(); //初期ポイント
      int Q = sc.nextInt(); //正解数
      int[] A = new int[Q]; //正解者リスト
      for(int i=0; i<Q; i++) A[i] = sc.nextInt();
      int[] menber = new int[N];
      for(int i=0; i<N; i++) menber[i] = K - Q; //初期ポインツ
      
      for(int i=0; i<Q; i++){
        int ans = A[i] - 1;
        menber[ans]++;
      }
      for(int i=0; i<N; i++){
        if( menber[i] > 0) System.out.println("Yes");
        else System.out.println("No");
      }
	}
}