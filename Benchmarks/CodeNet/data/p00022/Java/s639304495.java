
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

final class Main {

    private Main() {
    }

    public static void main(final String[] argv) throws IOException {
        final BufferedReader inputReader =
                new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            int n = Integer.parseInt(inputReader.readLine());
            if (n == 0) {
                break;
            }
            int[] inputList = new int[n];
            for (int i = 0; i < n; i++) {
                inputList[i] = Integer.parseInt(inputReader.readLine());
            }
            int max = 0;
            for (int i = 0; i < inputList.length; i++) {
                int sum = 0;
                for (int j = i; j < inputList.length; j++) {
                    sum += inputList[j];
                    if (max < sum) {
                        max = sum;
                    }
                }
            }
            System.out.println(max);
        }
    }
}