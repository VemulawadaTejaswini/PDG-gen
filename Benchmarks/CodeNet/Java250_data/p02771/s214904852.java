import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);

        HashSet<Integer> set = new HashSet<>();
        set.add(scanner.nextInt());
        set.add(scanner.nextInt());
        set.add(scanner.nextInt());

        System.out.println(set.size() == 2 ? "Yes" : "No");
    }
}
