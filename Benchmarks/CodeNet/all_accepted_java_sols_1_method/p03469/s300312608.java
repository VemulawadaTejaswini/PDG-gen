import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        /**           入力                    **/
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //キー入力を取得
        String line = br.readLine();//1列目を取得
        String aInput[] = null;
        aInput = line.split(" ");
        //デバッグ
//        for(String aTxt : aInput) {
//          System.out.println(aTxt);
//        }
        
        /********** ここから問題 ********/
        /**           定数                    **/
        
        /**           変数                    **/
        String aDate = null;
        
        /**           出力                    **/
        System.out.println(aInput[0].replaceAll("2017", "2018"));
    }
}