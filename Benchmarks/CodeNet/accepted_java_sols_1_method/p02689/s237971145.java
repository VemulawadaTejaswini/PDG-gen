import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.Map;

class Main {
    public static void main(final String[] args) throws Exception {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
            List<String> firstRow = Arrays.asList(br.readLine().split(" "));
            int N = Integer.parseInt(firstRow.get(0));
            int M = Integer.parseInt(firstRow.get(1));
            List<String> heightInputList = Arrays.asList(br.readLine().split(" "));
            Map<Integer, Integer> heightMap = new HashMap<>();
            Map<Integer, Boolean> goodTowerMap = new HashMap<>();
            int towerNumber = 1;
            for (String str : heightInputList) {
                heightMap.put(towerNumber, Integer.parseInt(str));
                goodTowerMap.put(towerNumber, true);
                towerNumber++;
            }

            List<List<String>> passList = new ArrayList<>();
            for (int i = 0; i < M; i++) {
                passList.add(Arrays.asList(br.readLine().split(" ")));
            }

            for (List<String> list : passList) {
                int i = Integer.parseInt(list.get(0));
                int j = Integer.parseInt(list.get(1));
                if (heightMap.get(i).intValue() > heightMap.get(j).intValue()) {
                    goodTowerMap.put(j, false);
                } else if (heightMap.get(i).intValue() < heightMap.get(j).intValue()) {
                    goodTowerMap.put(i, false);
                } else if (heightMap.get(i).intValue() == heightMap.get(j).intValue()) {
                    goodTowerMap.put(i, false);
                    goodTowerMap.put(j, false);
                }
            }

            int count = 0;
            for (Map.Entry<Integer, Boolean> entrySet : goodTowerMap.entrySet()) {
                if (entrySet.getValue()) {
                    count++;
                }
            }

            System.out.println(count);
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            System.exit(0);
        } catch (final Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
    }
}