import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String N = br.readLine();
        int tmp = Integer.parseInt(N.substring(N.length() - 1));

        if (tmp == 2 || tmp == 4 || tmp == 5 || tmp == 7 || tmp == 9) {
            System.out.print("hon");
        } else if (tmp == 0 ||tmp == 1 ||tmp == 6 ||tmp == 8) {
            System.out.print("pon");
        } else {
            System.out.print("bon");
        }
    }
}