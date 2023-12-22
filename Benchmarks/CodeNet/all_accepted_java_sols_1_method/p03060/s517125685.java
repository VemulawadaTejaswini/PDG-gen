import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int Vn[] = new int[N];
        int Cn[] = new int[N];
        //Vn,Cnに値を取り込む
        for (int i = 0; i < N; i++) {
            Vn[i] = s.nextInt();
        }
        for (int i = 0; i < N; i++) {
            Cn[i] = s.nextInt();
        }
        //計算して＋の時だけ足す
        int ans = 0;
        int check = 0;
        for (int i = 0; i < N; i++) {
            check = Vn[i] - Cn[i];
            if (check > 0) {
                ans +=check;
            }
            check = 0;
        }
        //ansを出力する
        System.out.print(ans);
    }
}