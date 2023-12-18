import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        List<Double> p = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            double a = sc.nextDouble();
            a = (a + 1.0) / 2;
            p.add(a);
        }

        double mx = 0.0;
        double s = 0.0;
        Queue<Double> q = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            s += p.get(i);
            q.add(p.get(i));
            if (q.size() > k) {
                s -= q.remove();
            }
            if (q.size() == k) {
                mx = Math.max(mx, s);
            }
        }

        System.out.println(mx);
    }
}