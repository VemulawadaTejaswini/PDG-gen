import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;


public class Main {

    public static void main(String[] args) throws IOException {
        //Input 整数を入力する
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int n = Integer.parseInt(str);
        //借金
        double loan = 100000;

        //入力した整数後の借金の残高を求める
        //1週間とは限らないから、ループの処理を入れる
        for(int i=1; i<=n; i++){
           //借金に5%の利子を加える
           loan = loan * 1.05;
           //借金の1000円未満を切り上げる
           BigDecimal bd = new BigDecimal(String.valueOf(loan));
           //第1引数が0の場合、小数第一位を切り上げ(参考)
           //1000未満は切り上げのため、第1引数を-3とし、百の位を切り上げする
           loan = bd.setScale(-3, BigDecimal.ROUND_UP).doubleValue();
        }
        //表示する際に、小数点を含む形で出力しないために、借金をint型のresultに格納する
        int result = (int) loan;
        System.out.println(result);
    }
}