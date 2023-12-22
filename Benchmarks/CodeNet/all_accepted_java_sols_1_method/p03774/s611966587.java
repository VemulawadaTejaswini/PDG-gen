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
            int studentCount = Integer.parseInt(firstRow.get(0));
            int checkPointCount = Integer.parseInt(firstRow.get(1));

            List<Integer> studentPointList = new ArrayList<>();
            for (int i = 0; i < studentCount; i++) {
                List<String> tmpInput = Arrays.asList(br.readLine().split(" "));
                studentPointList.add(Integer.parseInt(tmpInput.get(0)));
                studentPointList.add(Integer.parseInt(tmpInput.get(1)));
            }

            List<Integer> checkPointList = new ArrayList<>();
            for (int i = 0; i < checkPointCount; i++) {
                List<String> tmpInput = Arrays.asList(br.readLine().split(" "));
                checkPointList.add(Integer.parseInt(tmpInput.get(0)));
                checkPointList.add(Integer.parseInt(tmpInput.get(1)));
            }

            List<List<Integer>> distanceList = new ArrayList<>();
            for (int i = 0; i < studentPointList.size() - 1; i += 2) {
                List<Integer> distanceListTmp = new ArrayList<>();
                for (int j = 0; j < checkPointList.size() - 1; j += 2) {
                    distanceListTmp.add(Math.abs(studentPointList.get(i) - checkPointList.get(j)) + Math.abs(studentPointList.get(i + 1) - checkPointList.get(j + 1)));
                }
                distanceList.add(distanceListTmp);
            }

            List<Integer> ansList = new ArrayList<>();
            for (List<Integer> distances : distanceList) {
                int min = distances.get(0);
                int ansTmp = 1;
                for (int i = 0; i < distances.size(); i++) {
                    if (distances.get(i) < min) {
                        min = distances.get(i);
                        ansTmp = i + 1;
                    }
                }
                ansList.add(ansTmp);
            }

            for (int ans : ansList) {
                System.out.println(ans);
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