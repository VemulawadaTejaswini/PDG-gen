
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
            final String inputA = inputReader.readLine();
            final String inputB = inputReader.readLine();
            if (inputA == null || inputB == null) {
                break;
            }
            final String[] splitA = inputA.split(" ");
            final String[] splitB = inputB.split(" ");

            int hit = 0;
            int blow = 0;
            for (int i = 0; i < splitA.length; i++) {
                if (splitA[i].equals(splitB[i])) {
                    hit++;
                    splitA[i] = "";
                    splitB[i] = "";
                }
            }
            for (int i = 0; i < splitA.length; i++) {
                if (splitA[i].length() == 0) {
                    continue;
                }
                for (int j = 0; j < splitB.length; j++) {
                    if (splitA[i].equals(splitB[j])) {
                        blow++;
                        splitA[i] = "";
                        splitB[j] = "";
                        break;
                    }
                }
            }
            System.out.printf("%d %d\n", hit, blow);
        }
    }
}