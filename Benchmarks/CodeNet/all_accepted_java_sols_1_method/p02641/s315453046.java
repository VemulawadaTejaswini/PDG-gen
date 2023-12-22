import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer X = sc.nextInt();
        Integer N = sc.nextInt();
        List<Integer> p = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            p.add(sc.nextInt());
        }
        sc.close();

        if (N == 0) {
            System.out.println(X);
            return;
        }

        Collections.sort(p);

        for (int i = 0; i < 100; i++) {
            if (!p.contains(X - i)) {
                System.out.println(X - i);
                return;
            }
            if (!p.contains(X + i)) {
                System.out.println(X + i);
                return;
            }
        }
    }
}
