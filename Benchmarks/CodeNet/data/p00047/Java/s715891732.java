
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

final class Main {

    private static final String[] keys = {"A", "B", "C"};

    private Main() {
    }

    public static void main(final String[] argv) throws IOException {
        final BufferedReader inputReader =
                new BufferedReader(new InputStreamReader(System.in));
        boolean[] cups = new boolean[3];
        Arrays.fill(cups, false);
        cups[0] = true;
        while (true) {
            String input = inputReader.readLine();
            if (input == null) {
                break;
            }
            String[] temp = input.split(",");
            swap(cups, getIndex(temp[0]), getIndex(temp[1]));
        }
        for (int i = 0; i < cups.length; i++) {
            if (cups[i]) {
                System.out.println(keys[i]);
                break;
            }
        }
    }

    private static void swap(boolean[] cups, int indexA, int indexB) {
        boolean temp = cups[indexA];
        cups[indexA] = cups[indexB];
        cups[indexB] = temp;
    }

    private static int getIndex(String key) {
        for (int i = 0; i < keys.length; i++) {
            if (key.equals(keys[i])) {
                return i;
            }
        }
        return -1;
    }
}