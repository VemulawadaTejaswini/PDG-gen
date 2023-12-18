import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
  
class Main {
    public static void main(String[] args)throws IOException {
        //経過週の取得
        int n = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in), 64).readLine()); 

        //借金の金額
        int result = 100000;
          
        //n週後の借金の残高を演算する
        //一週間ごとに 5% の利子を借金に加え、さらに借金の 1,000 円未満を切り上げる。
        if (n != 0) {
            for(int i = 0; i < n;i++){
                //借金の5% を利子として追加
                result =(int)(result + (result * 0.05));
                //借金の 1,000 円未満を切り上げ
                if((result % 1000) != 0 ){
                    result = ((int)(result / 1000) + 1) * 1000;
                }
            }
        }
        //結果の出力
        System.out.println(result);
    }
}