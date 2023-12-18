import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        new Main().solve();
    }

    private void solve() throws IOException {
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int num = Integer.parseInt(f.readLine());
        int kyu = 8;
        while (num - 200 >= 400) {
            num -= 200;
            kyu--;
        }

        out.println(kyu);
        out.close();
    }
}