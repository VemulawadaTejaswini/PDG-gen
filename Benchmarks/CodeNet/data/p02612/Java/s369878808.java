import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        System.out.println(problem173a(m));
    }

    private static int problem173a(int n) {
        return ((n % 1000) == 0) ? 0 : (1000 - (n % 1000));
    }
}