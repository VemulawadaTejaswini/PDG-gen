import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        final Set<Integer> appeared = new HashSet<>();
        int m = 1;
        do {
            appeared.add(s);
            if (s % 2 == 0) {
                s = s / 2;
            } else {
                s = 3 * s + 1;
            }
            m++;
        } while (!appeared.contains(s));
        System.out.println(m);
    }
}
