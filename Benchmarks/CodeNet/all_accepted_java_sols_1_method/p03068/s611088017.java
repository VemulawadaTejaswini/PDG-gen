import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String... args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = 0;
        String S = "";
        int K = 0;
        try {
            N = Integer.parseInt(bufferedReader.readLine());
            S = bufferedReader.readLine();
            K = Integer.parseInt(bufferedReader.readLine());
        } catch (IOException e){
            e.printStackTrace();
            return;
        }

        char c = S.charAt(K-1);
        System.out.println(S.replaceAll("[^" + c + "]", "*"));
    }
}
