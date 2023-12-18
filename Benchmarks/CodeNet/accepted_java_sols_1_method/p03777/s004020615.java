import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static final String LEFT = "LEFT";
    public static final String RIGHT = "RIGHT";
    public static void main(String[] args) {
        try {
            // 標準入力
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            String strArr[] = br.readLine().split(" ");
            if ("H".equals(strArr[0])) {
                if ("H".equals(strArr[1])) {
                    System.out.println("H");
                } else {
                    System.out.println("D");
                }
            } else {
                if ("H".equals(strArr[1])) {
                    System.out.println("D");
                } else {
                    System.out.println("H");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}