import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = Integer.parseInt(sc.next());
            if (n == 0) break;

            List<Integer> S = new ArrayList<>();
            double ave = 0.0;
            for (int i = 0; i < n; i++) {
                S.add(Integer.parseInt(sc.next()));
                ave += S.get(i);
            }
            ave /= n;

            double ans = 0.0;
            for (int i = 0; i < n; i++) {
                ans += Math.pow((S.get(i) - ave), 2.0);
            }
            ans /= n;

            System.out.println(Math.sqrt(ans));
        }
    }
}