import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * Debt Hell<br/>
 * n を入力したとき、n 週間後の借金の残高を出力し終了するプログラム。n は 100 以下とします。 <br/>
 * 10 万円の借金に対し、一週間ごとに 5% の利子を借金に加え、さらに借金の 1,000 円未満を切り上げます。<br/>
 */
public class Main {
    public static void main(String args[]) throws IOException {
        //n週間の入力を取得
        int nWeeks = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
        
        int debt = 100000;
        for(int i = 0; i < nWeeks; i++) {
            //5％の利子を加え、1000円未満を切り上げ
            debt = new BigDecimal(debt * 1.05).setScale(-3, BigDecimal.ROUND_CEILING).intValue();
        }
        System.out.println(debt);

    }
} 