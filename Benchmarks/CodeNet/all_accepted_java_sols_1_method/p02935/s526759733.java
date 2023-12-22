import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        List<Double> l = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            l.add(s.nextDouble());
        }
        Collections.sort(l);
        double ch = 0;
        double ans = 0;
        for (double i : l) {
            if (ans == 0) {
                ans = i;
            }
            ans=(ans+i)/2;
        }
        System.out.print(ans);
    }
}