import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main{

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");

        List<Integer> converted = SortingFiveNumbers.convertToNumbers(input);

        StringBuilder builder = new StringBuilder();

        converted.stream().sorted((num1, num2) -> num2 - num1).forEach(num -> builder.append(num + " "));

        System.out.println(builder.delete(builder.length() - 1, builder.length() - 1));

    }

    public static List<Integer> convertToNumbers(String[] input) {

        List<Integer> converted = new ArrayList<>();

        for (String string : input) {
            converted.add(Integer.parseInt(string));
        }

        return converted;
    }

}