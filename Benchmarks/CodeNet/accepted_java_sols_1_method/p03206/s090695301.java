import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) throws Exception {

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int inputDay = Integer.parseInt(br.readLine());
            StringBuilder inputDayIs = new StringBuilder();
            inputDayIs.append("Christmas");

            for (int i = 0; i < (25 - inputDay); i++) {
                inputDayIs.append(" Eve");
            }

            System.out.println(inputDayIs);
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            System.exit(0);
        } catch (final Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
    }
}