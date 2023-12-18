import java.util.*;
import javax.lang.model.util.ElementScanner6;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 入力
        int a = sc.nextInt();
        int b = sc.nextInt();
        int m = sc.nextInt();

        // 処理
        int out = 0;

        //a
        int[] aa = new int[a];
        aa[0] = sc.nextInt();
        int aa_min = aa[0];
        for(int i = 1; i < a; i++){
            aa[i] = sc.nextInt();
            aa_min = (aa[i] < aa_min) ? aa[i] : aa_min;
        }

        //b
        int[] bb = new int[b];
        bb[0] = sc.nextInt();
        int bb_min = bb[0];
        for(int i = 1; i < b; i++){
            bb[i] = sc.nextInt();
            bb_min = (bb[i] < bb_min) ? bb[i] : bb_min;
        }

        //min
        int min = aa_min + bb_min;

        //m
        for(int i = 0; i < m; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int c = sc.nextInt();

            min = ((aa[x-1] + bb[y-1] - c) < min) ? (aa[x-1] + bb[y-1] - c) : min;
        }
        out = min;

        // 出力
        System.out.println(out);
    }
}