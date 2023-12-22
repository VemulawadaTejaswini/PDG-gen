import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            String[] W = new String[N];
            for (int i = 0; i < N; i++) {
                W[i] = in.next();
            }

            HashSet<String> used = new HashSet<>();
            used.add(W[0]);
            for (int i = 1; i < N; i++) {
                if (!used.add(W[i]) || !W[i - 1].substring(W[i - 1].length() - 1, W[i - 1].length()).equals(W[i].substring(0, 1))) {
                    System.out.println("No");
                    return;
                }
            }
            System.out.println("Yes");
        }
    }
}
