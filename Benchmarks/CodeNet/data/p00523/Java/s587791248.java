import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    private static final long MAX_LENGTH = 100000000000000L;

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line;
        int numOfPieces = 0;
        List<Integer> lengthOfPieces = new ArrayList<>();
        try {
            line = br.readLine();

            numOfPieces = Integer.parseInt(line);
            for (int i = 0; i < numOfPieces; i++) {
                line = br.readLine();
                lengthOfPieces.add(Integer.parseInt(line));
            }
        } catch (IOException ex) {
            ex.printStackTrace();
            System.exit(-1);
        }

        // ????????£??????????????????????????????
        Set<Set<Integer>> combinations = makeCombination(numOfPieces);

        long maxLength = 0;
        for (Set<Integer> combination : combinations) {
            long minLength = MAX_LENGTH;
            // ????????£???????????????????????¨???????°??????????????????????????±???????
            minLength = Math.min(minLength,
                    Collections.min(calcEachLength(lengthOfPieces, combination)));
            // ????°???????????????????????????????????????§????????????????????????
            maxLength = Math.max(maxLength, minLength);
        }
        System.out.println(maxLength);
    }

    private static Set<Long> calcEachLength(List<Integer> lengthOfPieces, Set<Integer> combination) {
        Set<Long> result = new HashSet<>();

        List<Integer> combinationList = new ArrayList<>(combination);
        Collections.sort(combinationList);

        // ???????????????????????§?????????
        long lastLength = 0;
        for (int i = combinationList.get(combinationList.size() - 1); i <= lengthOfPieces.size(); i++) {
            lastLength += lengthOfPieces.get(i - 1);
        }
        long firstLength = 0;
        for (int i = 1; i < combinationList.get(0); i++) {
            firstLength += lengthOfPieces.get(i - 1);
        }
        result.add(firstLength + lastLength);

        // 2, 3???????????????????????§?????????
        for (int i = 1; i < combinationList.size(); i++) {
            long length = 0;
            for (int j = combinationList.get(i - 1); j < combinationList.get(i); j++) {
                length += lengthOfPieces.get(j - 1);
            }
            result.add(length);
        }

        return result;
    }

    private static Set<Set<Integer>> makeCombination(int numOfPieces) {
        Set<Set<Integer>> result = new HashSet<>();

        for (int i = 1; i <= numOfPieces; i++) {
            for (int j = i + 1; j <= numOfPieces; j++) {
                for (int k = j + 1; k <= numOfPieces; k++) {
                    Set<Integer> set = new HashSet<>();
                    set.addAll(Arrays.asList(i, j, k));
                    result.add(set);
                }
            }
        }

        return result;
    }
}