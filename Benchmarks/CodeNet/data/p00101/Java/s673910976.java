
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
            String input = inputReader.readLine();
            if (input == null || input.equals("0")) {
                break;
            }
            int inputCount = Integer.parseInt(input);
            while (inputCount-- > 0) {
                input = inputReader.readLine();
//                input = input.replaceAll("^Hoshino$", "Hoshina")
//                        .replaceAll(" Hoshino$", " Hoshina")
//                        .replaceAll("^Hoshino ", "Hoshina ")
//                        .replaceAll(" Hoshino ", " Hoshina ")
//                        .replaceAll("^Hoshino\\.", "Hoshina.")
//                        .replaceAll(" Hoshino\\.", " Hoshina.");
                input = input.replaceAll("Hoshino", "Hoshina");
                System.out.println(input);
            }
        }
    }
}