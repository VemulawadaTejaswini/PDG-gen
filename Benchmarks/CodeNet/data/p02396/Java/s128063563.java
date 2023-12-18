import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = 0;
        do {
            int i = 1;
            x = Integer.parseInt(br.readLine());
            System.out.println("Case " + i + ": " + x);
            i++;
        } while (x != 0);
    }
}