import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(br.readLine());
        int a = 128;
        for (; a > n; a /= 2);
        System.out.println(a);

    }
}
