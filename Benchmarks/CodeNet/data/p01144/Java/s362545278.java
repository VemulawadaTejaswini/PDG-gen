import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            while(sc.hasNext()) {
                int N=sc.nextInt();
                int M=sc.nextInt();
                if(N+M==0)    break;
                int[] ds = new int[11];
                for(int i=0; i<N; i++) {
                    int d = sc.nextInt();  //距離
                    int p = sc.nextInt();  //単位距離あたりの期待値
                    ds[p] += d;            //各期待値を持つ距離が何単位分あるかカウント
                }
                int P = 0;                 //リスクの合計値
                for(int p= 10; p >=0; p--) {     //期待値の高い方から
                    if(M >= ds[p]) {
                        M -= ds[p];       //予算を消費
                    }
                    else {
                        P += (ds[p] - M) * p;  //予算が無くなった分だけ期待値を合計
                        M = 0;
                    }
                }
                System.out.println(P);
            }
        }
    }
}
