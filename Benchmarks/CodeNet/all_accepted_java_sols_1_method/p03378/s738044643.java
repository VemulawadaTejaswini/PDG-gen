import java.lang.Math;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        Set<Integer> gates = new HashSet<>();

        for (int i = 0; i < m; i++) {
            gates.add(sc.nextInt());
        }

        int left_cost = 0;
        for (int i = 0; i < x; i++) {
            if (gates.contains(i)) { left_cost++; };
        }

        int right_cost = 0;
        for (int i = x + 1; i <= n; i++) {
            if (gates.contains(i)) { right_cost++; };
        }

        System.out.println(Math.min(left_cost, right_cost));
    }
}
