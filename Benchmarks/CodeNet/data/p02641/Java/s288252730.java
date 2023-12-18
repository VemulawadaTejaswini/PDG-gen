import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(run());
    }

    private static ArrayList<Integer> nScan(Scanner sc, int n) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            al.add(sc.nextInt());
        }
        return al;
    }

    private static Object run() {
        try (Scanner sc = new Scanner(System.in);) {
            int x = sc.nextInt(), n = sc.nextInt(), result = 0;
            if (n == 0) {
                return x;
            }
            ArrayList<Integer> p = nScan(sc, n);
            for (int i = x;;i++) {
                if (!p.contains(i)) {
                    result = i;
                    break;
                }
            }
            for (int i = x;;i--) {
                if (!p.contains(i)) {
                    if (result - x >= x - i) {
                        result = i;
                    }
                    break;
                }
            }
            return result;
        }
    }
}