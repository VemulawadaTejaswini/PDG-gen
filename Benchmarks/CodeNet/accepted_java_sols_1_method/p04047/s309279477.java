import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> lengthOfSticks = new ArrayList<>();
        for (int i = 0; i < 2 * n; ++i) {
            lengthOfSticks.add(scanner.nextInt());
        }
        lengthOfSticks.sort(Comparator.naturalOrder());
        long result = 0;
        for (int i = 0; i < n; ++i)
            result += lengthOfSticks.get(2 * i);
        System.out.println(result);
    }
}
