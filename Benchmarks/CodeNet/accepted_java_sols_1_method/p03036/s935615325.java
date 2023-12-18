import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        int D = scanner.nextInt();
        int x2000 = scanner.nextInt();

        List<Long> list = new ArrayList<>();
        long x = x2000 * r - D;
        list.add(x);
        for (int i=2002; i <= 2010; i++) {
            x = x * r - D;
            list.add(x);
        }

        list.forEach(System.out::println);
    }
}