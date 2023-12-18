import java.util.*;
import javax.lang.model.util.ElementScanner6;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 入力
        int n = sc.nextInt();
        int[] x = new int[n];
        int max = 1;
        for (int i = 0; i < n; i++){
            x[i] = sc.nextInt();
            max = max < x[i] ? x[i] : max;
        }

        // 処理
        int hp_max = 0;
        for (int i = 1; i <= max; i++){
            int hp_tmp = 0;
            for (int j = 0; j < n; j++){
                hp_tmp += Math.pow((i - x[j]), 2);
            }
            if (i == 1){
                hp_max = hp_tmp;
            } else {
                hp_max = hp_max > hp_tmp ? hp_tmp : hp_max;
            }
        }
        int out = hp_max;


        // 出力
        System.out.println(out);
    }

}