import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Object o = run();
        if (o != null)
            System.out.println(o);
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
            int result = 0;
            int time = 0;
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();
            ArrayList<Integer> a = nScan(sc, n);
            ArrayList<Integer> b = nScan(sc, m);
            while (!(a.isEmpty() && b.isEmpty())){
                if (!a.isEmpty() && (b.isEmpty() || a.get(0) <= b.get(0))) {
                    time += a.get(0);
                    a.remove(0);
                    result++;
                } else if (!b.isEmpty() && (a.isEmpty() || a.get(0) > b.get(0))) {
                    time += b.get(0);
                    b.remove(0);
                    result++;
                }
                if (time > k) return result - 1;
            }
            return result ;
        }
    }
}