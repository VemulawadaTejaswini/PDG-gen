
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

final class Main {

    private Main() {
    }

    public static void main(final String[] argv) throws IOException {
        final BufferedReader inputReader =
                new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = inputReader.readLine().split(" ");
        int[] values = new int[inputs.length];
        for (int i = 0; i < inputs.length; i++) {
            values[i] = Integer.parseInt(inputs[i]);
        }
        Arrays.sort(values);
        int[] temp = new int[values.length];
        for (int i = 0; i < values.length; i++) {
            temp[values.length - i - 1] = values[i];
        }
        String output = "";
        for (int i : temp) {
            output += i + " ";
        }
        System.out.println(output.trim());
    }
}