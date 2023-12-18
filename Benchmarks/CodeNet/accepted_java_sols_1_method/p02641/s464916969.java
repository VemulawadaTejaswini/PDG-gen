import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int N = sc.nextInt();
        int ans;

        if (N == 0) {
            System.out.println(X);
            return;
        }

        List<Integer> p = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            p.add(sc.nextInt());
        }

        for (int i = 0; i < N + 2; i++) {
            if (!p.contains(X - i)) {
                System.out.println(X - i);
                return;
            } else if (!p.contains(X + i)) {
                System.out.println(X + i);
                return;
            }
        }
    }
}