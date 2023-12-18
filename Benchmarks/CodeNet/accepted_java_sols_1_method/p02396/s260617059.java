import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = 0;
        int i = 1;
        while (true) {
            x = Integer.parseInt(br.readLine());
            if (x != 0) {
                System.out.println("Case " + i++ + ": " + x);
            } else {
                break;
            }
        }
    }
}