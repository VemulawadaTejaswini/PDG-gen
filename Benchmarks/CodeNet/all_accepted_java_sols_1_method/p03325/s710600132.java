import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        List<Long> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            long temp = Long.parseLong(sc.next());
            if (temp % 2 == 0) {
                a.add(temp);
            }
        }
        if (a.size() == 0) {
            System.out.println(0);
            return;
        }
        Collections.sort(a);
        int ans = 0;
        for (int i = 0; i < a.size(); i++) {
            while (a.get(i) % 2 == 0) {
                ans++;
                a.set(i, a.get(i) / 2);
            }
        }
        System.out.println(ans);
    }
}