import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);
        int x = Integer.parseInt(br.readLine());
        int sum = 0;
        int res = 0;
        while((sum + 500) <= x) {
            res += 1000;
            sum += 500;
        }
        while((sum + 5) <= x) {
            res += 5;
            sum += 5;
        }
        System.out.println(res);

    }
}