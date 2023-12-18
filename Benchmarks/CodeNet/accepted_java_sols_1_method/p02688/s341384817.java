

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public final class Main {

    public static void main(String[] args) {
        final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        final int n = in.nextInt();
        final int k = in.nextInt();
        in.nextLine();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < k; i++) {
            int d = in.nextInt();
            in.nextLine();
            for (int j = 0; j < d; j++) {
                set.add(in.nextInt());
            }
            in.nextLine();
        }
        int res = 0;
        for (int i = 1; i <= n; i++) {
            if (!set.contains(i)) {
                res++;
            }
        }
        System.out.println(res);
    }
}
