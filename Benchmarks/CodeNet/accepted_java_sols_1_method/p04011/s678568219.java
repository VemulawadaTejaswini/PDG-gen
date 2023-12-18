
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input =new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(input.readLine());
        int K = Integer.parseInt(input.readLine());
        int X = Integer.parseInt(input.readLine());
        int Y = Integer.parseInt(input.readLine());

        if (N>K) {
            System.out.println(X*K + Y*(N-K));
        } else {
            System.out.println(X*N);
        }
    }
}
