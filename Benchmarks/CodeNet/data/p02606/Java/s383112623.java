import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // Input
            int L = Integer.parseInt(sc.next());
            int R = Integer.parseInt(sc.next());
            int d = Integer.parseInt(sc.next());

            // Calc
            int cnt = 0;
            for (int i = L; i <= R; i++) {
                if (i % d == 0) cnt++;
            }
            System.out.println(cnt);
        }
    }
}
