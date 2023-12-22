

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int N = sc.nextInt();
            int X = sc.nextInt();
            int sum = 0;
            List<Integer> al = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                int m = sc.nextInt();
                al.add(m);
                sum += m;
            }
            X -= sum;

            Collections.sort(al);

            int ans = N;

            while (X > 0) {
                if ( X >= al.get(0) ) {
                    X -= al.get(0);
                    ans++;
                } else {
                    break;
                }
            }
            System.out.println(ans);
        }
    }
}
