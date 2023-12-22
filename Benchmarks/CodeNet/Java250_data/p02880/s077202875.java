
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<Integer> multi = new HashSet<>();

        for (int i = 1 ; i <= 9 ; i++) {
            for (int j = 1 ; j <= 9 ; j++) {
                multi.add(i * j);
            }
        }

        int N = scanner.nextInt();
        if (multi.contains(N)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
