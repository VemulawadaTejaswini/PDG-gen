

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public final class Main {

    public static void main(String[] args) {
        final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        final int t = Integer.parseInt(in.nextLine());
        for (int x = 0; x < t; x++) {
            final int n = Integer.parseInt(in.nextLine());
            final long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextLong();
            }
            in.nextLine();
            final String s = in.nextLine();
            final List<Long> left = new ArrayList<>();
            final List<Long> right = new ArrayList<>();
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == '1') {
                    left.add(arr[j]);
                } else {
                    right.add(arr[j]);
                }
            }
            final Set<Long> leftS = new HashSet<>();
            final Set<Long> rightS = new HashSet<>();
            dfs(left, leftS, 0, 0);
            dfs(right, rightS, 0, 0);
            System.out.println(leftS.equals(rightS) ? 0 : 1);
        }
    }

    public static void dfs(List<Long> nums, Set<Long> res, long curr, int idx) {
        res.add(curr);
        for (int i = idx; i < nums.size(); i++) {
            curr ^= nums.get(i);
            dfs(nums, res, curr, i + 1);
            curr ^= nums.get(i);
        }
    }
}
