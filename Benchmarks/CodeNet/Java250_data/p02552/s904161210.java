//package Test;

import java.util.*;

public class Main {

    static class Solution {

        void solve(int t){
            System.out.println(t == 1 ? 0 : 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        Solution solution = new Solution();
        solution.solve(t);

    }
}
