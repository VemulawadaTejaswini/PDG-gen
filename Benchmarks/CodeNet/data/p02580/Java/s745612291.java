

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public final class Main {

    public static void main(String[] args) {
        final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        final String[] line = in.nextLine().split(" ");
        final int n = Integer.parseInt(line[0]);
        final int m = Integer.parseInt(line[1]);
        final int mines = Integer.parseInt(line[2]);
        Map<Integer, Integer> rows = new HashMap<>();
        Map<Integer, Integer> cols = new HashMap<>();
        Set<String> seen = new HashSet<>();
        int maxR = 0;
        int maxC = 0;
        for (int i = 0; i < mines; i++) {
            final String[] curr = in.nextLine().split(" ");
            int x = Integer.parseInt(curr[0]);
            int y = Integer.parseInt(curr[1]);
            maxR = Math.max(maxR, rows.merge(x, 1, Integer::sum));
            maxC = Math.max(maxC, cols.merge(y, 1, Integer::sum));
            seen.add(x + "," + y);
        }
        List<Integer> maxRows = new ArrayList<>();
        List<Integer> maxCols = new ArrayList<>();
        for (Map.Entry<Integer, Integer> e : rows.entrySet()) {
            if (e.getValue() == maxR) {
                maxRows.add(e.getKey());
            }
        }
        for (Map.Entry<Integer, Integer> e : cols.entrySet()) {
            if (e.getValue() == maxC) {
                maxCols.add(e.getKey());
            }
        }
        int res = 0;
        for (int r : maxRows) {
            for (int c : maxCols) {
                int curr = maxR + maxC - (seen.contains(r + "," + c) ? 1 : 0);
                res = Math.max(res, curr);
            }
        }
        System.out.println(res);
    }
}
