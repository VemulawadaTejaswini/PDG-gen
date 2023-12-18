import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        List<String> inputs = Arrays.asList(input.split(" "));

        int result = Integer.valueOf(inputs.get(1)) / Integer.valueOf(inputs.get(0));

        if (result > Integer.valueOf(inputs.get(2))) {
            System.out.println(Integer.valueOf(inputs.get(2)));
        } else {
            System.out.println(result);
        }
    }
}
