import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    static int gcd(int x, int y) {
        if (y == 0) {
            return x;
        } else {
            return gcd(y, x % y);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] line = br.readLine().split(" ");

        int x = Integer.parseInt(line[0]);
        int y = Integer.parseInt(line[1]);

        int result = x + 1 + y + 1 - gcd(2 * x, y) - 1;

        System.out.println(result);
    }
}
