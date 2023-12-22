import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);
        String[] a = br.readLine().split(" ");

        for (int i = 0; i < m; i++) {
            n = n - Integer.parseInt(a[i]);
        }

        if (n < 0) {
            n = -1;
        }
        System.out.println(n);
    }
}
