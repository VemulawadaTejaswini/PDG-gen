import java.util.*;

public class Main {
    public static void main(String args[]) {
       ///値を取得
       Scanner sc = new Scanner(System.in);
       int N = sc.nextInt();    //参加人数
       int K = sc.nextInt();    ///開始時点の点数
       int Q = sc.nextInt();    //正解数
       
       int[] A = new int[Q];    //参加者の配列
       int[] point = new int[N];    //各参加者の点数の配列
       
       for(int i = 0; i < Q; ++i) {
           A[i] = sc.nextInt(); //各参加者の終了時の点数を取得
           point[A[i]-1]++; //各参加者の点数を格納
       }
       
       for(int j = 0; j < N; ++j) {
             //出力
            if(K - Q + point[j] > 0) {
                System.out.println("Yes");
            } else {
               System.out.println("No");
            }
       }

    }
}
