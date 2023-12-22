import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String line = bufferedReader.readLine();
        int K = Integer.parseInt(line);
        String S = bufferedReader.readLine();
        if (S.length() > K) {
            System.out.println(S.substring(0, K) + "...");
        } else {
            System.out.println(S);
        }
    }
}
