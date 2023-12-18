import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.HashSet;

class Main {

    public static void main(String[] args) throws Exception {

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String[] inputNumbers = br.readLine().split(" ");
            Set<String> numbersSet = new HashSet<>();
            numbersSet.add(inputNumbers[0]); numbersSet.add(inputNumbers[1]);

            Set<String> firstGroup = new HashSet<>();
            Set<String> secondGroup = new HashSet<>();
            Set<String> thirdGroup = new HashSet<>();

            firstGroup.add("1"); firstGroup.add("3"); firstGroup.add("3"); firstGroup.add("5");
            firstGroup.add("7"); firstGroup.add("8"); firstGroup.add("10"); firstGroup.add("12");
            secondGroup.add("4"); secondGroup.add("6"); secondGroup.add("9"); secondGroup.add("11");
            thirdGroup.add("2");
            
            String result = "No";

            if (firstGroup.containsAll(numbersSet)
                || secondGroup.containsAll(numbersSet)
                || thirdGroup.containsAll(numbersSet)) {
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
}
