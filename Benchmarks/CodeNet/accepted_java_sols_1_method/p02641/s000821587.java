
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int X = scanner.nextInt();
        int N = scanner.nextInt();
        Set<Integer> p = new HashSet<>();

        for (int i = 0 ; i < N ; i++) {
            p.add(scanner.nextInt());
        }

        int diff = 0;
        while(true) {
            if (!p.contains(X - diff)) {
                System.out.println(X - diff);
                return;
            }
            if (!p.contains(X + diff)) {
                System.out.println(X + diff);
                return;
            }
            diff++;
        }
    }
}
