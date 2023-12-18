
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

final class Main {

    private Main() {
    }

    public static void main(final String[] argv) throws IOException {
        final BufferedReader inputReader =
                new BufferedReader(new InputStreamReader(System.in));
        int totalPrice = 0;
        int totalAmount = 0;
        int count = 0;
        while (true) {
            String input = inputReader.readLine();
            if (input == null) {
                break;
            }
            String[] temp = input.split(",");
            totalPrice += Integer.parseInt(temp[0]) * Integer.parseInt(temp[1]);
            totalAmount += Integer.parseInt(temp[1]);
            count++;
        }
        int average = (int) Math.round(totalAmount / (double) count);
        System.out.println(totalPrice);
        System.out.println(average);
    }
}