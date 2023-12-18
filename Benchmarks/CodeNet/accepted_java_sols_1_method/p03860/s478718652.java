import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try {
            // 標準入力
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            String strArr[] = br.readLine().split(" ");
            String str1 = strArr[0];
            String str2 = strArr[1];
            String str3 = strArr[2];
            System.out.print(str1.charAt(0));
            System.out.print(str2.charAt(0));
            System.out.println(str3.charAt(0));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}