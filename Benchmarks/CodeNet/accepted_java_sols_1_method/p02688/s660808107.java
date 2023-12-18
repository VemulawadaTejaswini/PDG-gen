import java.util.*;
import javax.lang.model.util.ElementScanner6;
//import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 入力
        int n = sc.nextInt();
        int k = sc.nextInt();
        //String s = sc.next();

        // 処理
        int[] w = new int[n];
        for(int i = 0; i < k; i++){
            int d = sc.nextInt();
            for(int j = 0; j < d; j++){
                int a = sc.nextInt();
                w[a-1] = 1;
            }
        }
        int out = 0;
        for(int i = 0; i < n; i++){
            if (w[i] == 0) out++;
        }

        // 出力
        System.out.println(out);
    }
}