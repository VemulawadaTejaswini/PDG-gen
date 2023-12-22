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

            int cityCount = Integer.parseInt(firstRow.get(0));
            int pathCount = Integer.parseInt(firstRow.get(1));

            List<Integer> pathList = new ArrayList<>();
            for (int i = 0; i < pathCount; i++) {
                List<String> inputRow = Arrays.asList(br.readLine().split(" "));
                pathList.add(Integer.parseInt(inputRow.get(0)));
                pathList.add(Integer.parseInt(inputRow.get(1)));
            }

            List<Integer> ansList = new ArrayList<>();
            for (int i = 1; i <= cityCount; i++) {
                ansList.add(0);
                for (int j = 0; j < pathList.size(); j++) {
                    if (i == pathList.get(j)) {
                        ansList.set(i - 1, ansList.get(i - 1) + 1);
                    }
                }
            }

            for (int i = 0; i < ansList.size(); i++) {
                System.out.println(ansList.get(i));
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            System.exit(0);
        } catch (final Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
    }
}