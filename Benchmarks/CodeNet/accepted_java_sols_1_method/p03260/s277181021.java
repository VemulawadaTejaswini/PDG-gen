import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(input.readLine());
        int a = Integer.parseInt(tokenizer.nextToken());
         a*= Integer.parseInt(tokenizer.nextToken());

        for (int i = 1; i < 4; i++) {
            if (((a*i) & 1) != 0) {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}
