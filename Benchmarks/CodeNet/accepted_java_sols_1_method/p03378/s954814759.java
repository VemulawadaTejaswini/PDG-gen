import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        List<Boolean> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(false);
        }
        for (int i = 0; i < m; i++) {
            a.set(sc.nextInt(), true);
        }

        int costZero = 0;
        int costN = 0;
        for (int i = x; i > 0; i--) {
            if (a.get(i)) {
                costZero++;
            }
        }
        for (int i = x; i < n; i++) {
            if (a.get(i)) {
                costN++;
            }
        }
        System.out.println(Math.min(costZero, costN));
    }

}
