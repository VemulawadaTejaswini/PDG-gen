//package atcoder;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);
        final int X = in.nextInt();
        final int N = in.nextInt();
        final Set<Integer> p = new HashSet<>();

        for (int i = 1; i <= N; ++i) {
            p.add(in.nextInt());
        }

        for (int d = 0; d <= 100; ++d){
            if (!p.contains(X - d)) {
                System.out.println(X - d);
                return;
            }
            if (!p.contains(X + d)) {
                System.out.println(X + d);
                return;
            }
        }
        System.out.println(0);
    }
}
