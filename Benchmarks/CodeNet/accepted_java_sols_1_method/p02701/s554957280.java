import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            String[] S = new String[N];
            for (int i = 0; i < N; i++) {
                S[i] = sc.next();
            }

            HashSet<String> set = new HashSet<String>();
            for (int i = 0; i < N; i++) {
                set.add(S[i]);
            }
            System.out.println(set.size());
        }
    }
}
