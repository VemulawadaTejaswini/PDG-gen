import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Arrays;

class Main {

    public static void main(String[] args) throws IOException {
        doit(args, System.in, System.out);
    }

    static void doit(String[] args, InputStream in, PrintStream out)
            throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        while (true) {
            String line = reader.readLine();
            if (line == null || line.isEmpty()) {
                break;
            }
            String[] values = line.split(",");
            int[] numbers = new int[5];
            int[] counts = new int[13];
            for (int i = 0; i < 5; i++) {
                int number = Integer.parseInt(values[i]);
                numbers[i] = number;
                counts[number - 1] += 1;
            }
            String result = null;
            Arrays.sort(counts);
            if (counts[12] == 4) {
                result = "four card";
            } else if (counts[12] == 3 && counts[11] == 2) {
                result = "full house";
            } else {
                Arrays.sort(numbers);
                if (numbers[4] - numbers[0] == 4
                        || (numbers[0] == 1 && numbers[1] + numbers[4] == 23)) {
                    result = "straight";
                } else if (counts[12] == 3) {
                    result = "three card";
                } else if (counts[11] == 2) {
                    result = "two pair";
                } else if (counts[12] == 2) {
                    result = "one pair";
                }
            }

            out.println(result);
        }
    }
}