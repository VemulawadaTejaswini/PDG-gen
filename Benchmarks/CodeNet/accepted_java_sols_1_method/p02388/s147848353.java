import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws Exception {
        
        InputStreamReader ISR = new InputStreamReader(System.in);
        BufferedReader BR = new BufferedReader(ISR);
        //入力
        String strInput =  BR.readLine();
        //入力内容をint型に変換
        int intNum = Integer.parseInt(strInput);
        //3乗したもの
        int intCubic = intNum*intNum*intNum;
        //出力
        System.out.println(intCubic);
        
    }
}

