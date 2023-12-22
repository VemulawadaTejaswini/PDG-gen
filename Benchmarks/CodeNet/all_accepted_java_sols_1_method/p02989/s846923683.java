import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> d = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            d.add(sc.nextInt());
        }
        sc.close();

        Collections.sort(d);

        if (d.size() % 2 != 0) {
            System.out.println(0);
            System.exit(0);
        }

        int a = d.get(n / 2 - 1);
        int b = d.get(n / 2);
        int ans = b - a;
        System.out.println(ans);
    }

}
