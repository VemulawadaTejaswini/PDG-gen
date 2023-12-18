
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

final class Main {

    private Main() {
    }

    public static final int MAX_LENGTH = 80;

    public static void main(final String[] argv) throws IOException {
        final BufferedReader inputReader =
                new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(inputReader.readLine());
        while (n-- != 0) {
            BigInteger x = new BigInteger(inputReader.readLine());
            BigInteger y = new BigInteger(inputReader.readLine());
            if (x.toString().length() > MAX_LENGTH
                    || y.toString().length() > MAX_LENGTH) {
                System.out.println("overflow");
                continue;
            }
            x = x.add(y);
            String message;
            if (x.toString().length() > MAX_LENGTH) {
                message = "overflow";
            } else {
                message = x.toString();
            }
            System.out.println(message);
        }
    }
}