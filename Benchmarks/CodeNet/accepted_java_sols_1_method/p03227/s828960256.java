import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String s = br.readLine();
            String[] sArray = s.split("");
            if (s.length() == 3) {
                for (int i = 2; i >= 0; i--) {
                    System.out.print(sArray[i]);
                }
            } else {
                for (int i = 0; i < 2; i++) {
                    System.out.print(sArray[i]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}