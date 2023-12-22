
import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int loopCount = Integer.parseInt(scanner.next());
        Integer cheaper = null;
        Integer maximum = null;
        for (int i = 0; i < loopCount; i++) {
            int current = Integer.parseInt(scanner.next());
            if (i == 0) {
                cheaper = current;
                continue;
            }

            int diff = current - cheaper;
            if (maximum == null || diff > maximum) {
                maximum = diff;
            }
            if (current < cheaper) {
                cheaper = current;
            }
        }

        System.out.println(maximum);
    }
}