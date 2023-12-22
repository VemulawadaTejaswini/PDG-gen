import java.util.Scanner;
/**
 * ABC129 B
 *
 */
public class Main {

    public static void main(String[] args) {
        int N = 0;
        int[] W = null;
        try (Scanner sc = new Scanner(System.in)) {
            N = sc.nextInt();
            W = new int[N];
            for(int i = 0; i<N; i++){
                W[i] = sc.nextInt();
            }

        }
        //全体の和
        int Sum =0;
        for(int i : W){
            Sum += i;
        }

        //差が最小添え字（暫定）
        int T = 0;
        //差（暫定） (いったんsumで初期化)
        int d = Sum;
        //添え字までの合計
        int sumT = 0;
        for(int i = 0;i < N;i++){
            sumT += W[i];
            //絶対値計算
            int temp = 0;
            if((Sum -sumT)>sumT){
                temp = (Sum -sumT) -sumT;
            }else{
                temp = sumT - (Sum -sumT);
            }
            //これまでの差分より小さい場合
            if(d>temp){
                //更新する
                d = temp;
                T = i +1;
            }
        }
        System.out.println(d);


    }

}
