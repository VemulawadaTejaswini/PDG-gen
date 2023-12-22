//package Test;

import java.util.*;

public class Main {

    static class Solution {

        void solve(long a, long b, long c, long d){
            long ans1 = Math.max(a * c, a * d);
            long ans2 = Math.max(b * c, b * d);
            System.out.println(Math.max(ans1, ans2));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long c = scanner.nextLong();
        long d = scanner.nextLong();
        Solution solution = new Solution();
        solution.solve(a, b, c, d);

    }
}
