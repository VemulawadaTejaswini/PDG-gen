import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class Main {

    public static void main(String[] args) throws Exception {

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            char[] input = br.readLine().toCharArray();
            List<Integer> charToIntList = new ArrayList<>();

            for (char c : input) {
                charToIntList.add((int) c);
            }

            sortNatualOrder(charToIntList);

            String result = "No";
            if (charToIntList.get(0) == charToIntList.get(1)
                && charToIntList.get(2) == charToIntList.get(3) 
                && charToIntList.get(1) != charToIntList.get(2)) {
                result = "Yes";
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

    private static void sortNatualOrder(List<Integer> intList) {
        for (int i = 0; i < intList.size() - 1; i++) {
            for (int j = intList.size() - 1; j > i; j--) {
                if (intList.get(j - 1) > intList.get(j)) {
                    int tmp = intList.get(j - 1);
                    intList.set(j - 1, intList.get(j));
                    intList.set(j, tmp);
                }
            }
        }
    }
}