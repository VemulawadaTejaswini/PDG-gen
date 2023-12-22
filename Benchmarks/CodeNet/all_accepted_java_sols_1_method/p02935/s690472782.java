import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        List<Integer> values = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .sorted()
                .collect(Collectors.toList());

        double tr = values.get(0);
        for (int i = 1; i < values.size(); i++) {
            tr = (tr + values.get(i)) / 2;
        }
        System.out.println(tr);
    }
}