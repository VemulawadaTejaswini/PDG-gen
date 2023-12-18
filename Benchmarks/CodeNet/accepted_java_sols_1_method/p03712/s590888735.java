import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Main {
    public static void main(final String[] args) throws Exception {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
            List<String> firstRow = Arrays.asList(br.readLine().split(" "));
            int height = Integer.parseInt(firstRow.get(0));
            int width = Integer.parseInt(firstRow.get(1));

            List<String> inputStringList = new ArrayList<>();
            for (int i = 0; i < height; i++) {
                inputStringList.add(br.readLine());
            }

            StringBuilder printForStartLineAndEndLine = new StringBuilder();
            for (int i = 0; i < width + 2; i++) {
                printForStartLineAndEndLine.append("#");
            }

            System.out.println(printForStartLineAndEndLine);
            for (String str : inputStringList) {
                System.out.println("#" + str + "#");
            }
            System.out.println(printForStartLineAndEndLine);
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            System.exit(0);
        } catch (final Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
    }
}