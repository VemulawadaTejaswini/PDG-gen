import java.util.*;

public class Main {
    public static void main(String[] args) {
        new Solver().solve(new Scanner(System.in));
//        new Solver().solve(new Scanner(ex));
    }

    private static final String ex = "5 7\n" +
            "0 2 3\n" +
            "0 3 1\n" +
            "0 4 4\n" +
            "1 1 2\n" +
            "1 1 3\n" +
            "1 3 3\n" +
            "1 1 5";
}

class Solver {
    void solve(Scanner scanner) {
        int[] split = splitInt(scanner.nextLine());
        int n = split[0];
        int q = split[1];

        long[] nums = new long[n + 1];
        SegmentTree st = new SegmentTree(nums);

        for (int i = 0; i < q; i ++) {
            split = splitInt(scanner.nextLine());
            int com = split[0];
            int x = split[1];
            int y = split[2];
            if (com == 0) {
                st.update(x, y);
            } else {
                System.out.println(st.query(x, y + 1));
            }
        }
    }

    private int[] splitInt(String s) {
        String[] split = s.split(" ");
        int[] splitInt = new int[split.length];
        for (int i = 0; i < split.length; i ++) {
            splitInt[i] = Integer.parseInt(split[i]);
        }
        return splitInt;
    }

    private long[] splitLong(String s) {
        String[] split = s.split(" ");
        long[] splitLong = new long[split.length];
        for (int i = 0; i < split.length; i ++) {
            splitLong[i] = Long.parseLong(split[i]);
        }
        return splitLong;
    }
}


class SegmentTree {
    private static final long DEFAULT_VALUE = 0;
    private long[] treeArray;
    private int length;

    SegmentTree(long[] nums) {
        length = marginLength(nums.length);
        treeArray = new long[length * 2 - 1];
        for (int i = 0; i < treeArray.length; i ++) {
            treeArray[i] = DEFAULT_VALUE;
        }
        for (int i = 0; i < nums.length; i ++)  {
            update(i, nums[i]);
        }
    }

    /**
     * query b/w [i, j)
     */
    long query(int i, int j) {
        if (i >= j) throw new IllegalArgumentException();
        return query(i, j, 0, 0, length);
    }

    private long query(int i, int j, int k, int l, int r) {
        if (r <= i || j <= l) return DEFAULT_VALUE;
        if (i <= l && r <= j) return treeArray[k];
        else {
            long vl = query(i, j, k * 2 + 1, l, (l + r) / 2);
            long vr = query(i, j, k * 2 + 2, (l + r) / 2, r);
            return updateFunc(vl, vr);
        }
    }

    void update(int i, long x) {
        i += length - 1;
        treeArray[i] = x;
        while (i > 0) {
            i = (i - 1) / 2;
            treeArray[i] = updateFunc(treeArray[i * 2 + 1], treeArray[i * 2 + 2]);
        }
    }

    private long updateFunc(long a, long b) {
        return a + b;
    }

    private int marginLength(int length) {
        if ((length & (length - 1)) == 0) return length;
        int count = 0;
        while (length > 0) {
            length = length >> 1;
            count ++;
        }
        return 1 << count;
    }
}