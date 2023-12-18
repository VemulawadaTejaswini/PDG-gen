import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int A = in.nextInt();
            int B = in.nextInt();
            int K = in.nextInt();

            TreeSet<Integer> set = new TreeSet<>();
            for (int i = A; i < Math.min(A + K, B); i++) {
                set.add(i);
            }
            for (int i = Math.max(B - (K - 1), A); i <= B; i++) {
                set.add(i);
            }

            for (Integer i : set) {
                System.out.println(i);
            }
        }
    }
}
