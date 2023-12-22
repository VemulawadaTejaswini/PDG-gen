import java.util.*;

public class Main {
    public static void main(String[] args) {
      
        // 標準入力から値を取得してinputに入れる
        Scanner sc = new Scanner(System.in);
        String inputStr = sc.nextLine();
        char[] inputCh = inputStr.toCharArray();

        int inputNum = Integer.parseInt(inputStr);  // 入力値
        int sn = 0;                                 // 各桁の和
        String answer = "No";                       // 出力結果

        for (int i = 0; i < inputCh.length; i++) {
            int num = Character.getNumericValue(inputCh[i]);
            sn = sn + num;
        }
      
        if (inputNum % sn == 0) {
            answer = "Yes";
        }  
      
        System.out.println(answer);
    }
}
