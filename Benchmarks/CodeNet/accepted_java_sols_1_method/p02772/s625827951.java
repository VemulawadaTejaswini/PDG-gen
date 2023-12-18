import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        scanner.nextLine();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            list.add(scanner.nextInt());
        }
        boolean bool = list.stream()
                .filter(f -> f % 2 == 0)
                .allMatch(f -> f % 3 == 0 || f % 5 == 0);

        if (bool) {
            System.out.println("APPROVED");
        } else {
            System.out.println("DENIED");
        }
    }
}