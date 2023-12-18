

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public final class Main {

    public static void main(String[] args) {
        final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        final int n = in.nextInt();
        in.nextLine();
        final TreeSet<Integer> ts = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            ts.add(in.nextInt());
        }
        if (ts.size() == 1) {
            System.out.println(0);
            return;
        }
        final Set<Integer> divs = new HashSet<>();
        int res = 0;
        for (int num : ts) {
            boolean found = true;
            final int copy = num;
            outer:
            for (int p = 2; p * p <= copy; p++) {
                while (num % p == 0) {
                    num /= p;
                    if (divs.contains(p) || divs.contains(num)) {
                        found = false;
                        break outer;
                    }
                }
            }
            if (found) {
                if (divs.add(copy)) { 
                    res++;
                }
                divs.add(copy);
            }
        }
        System.out.println(res);
    }
}
