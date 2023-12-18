
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

final class Main {

    private Main() {
    }

    public static void main(final String[] argv) throws IOException {
        final BufferedReader inputReader =
                new BufferedReader(new InputStreamReader(System.in));
        System.out.println(factorial(Integer.parseInt(inputReader.readLine())));
    }
    public static long factorial(long n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }
}