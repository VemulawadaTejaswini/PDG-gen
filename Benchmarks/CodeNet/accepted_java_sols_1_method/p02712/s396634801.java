import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) throws Exception {

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            long count = Integer.parseInt(br.readLine());
            long result = 0;
            for (long i = 1; i <= count; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    continue;
                } else if (i % 3 == 0) {
                    continue;
                } else if (i % 5 == 0) {
                    continue;
                } else {
                    result += i;
                }
            }

            System.out.println(result);
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            System.exit(0);
        } catch (final Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
    }
}