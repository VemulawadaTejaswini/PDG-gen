
import java.util.Arrays;
import java.util.Scanner;


public class Main {

    public static class SegmentTree {

        int[] tree;
        int rawLen;

        public SegmentTree(int rawLen) {
            int len = Integer.highestOneBit(rawLen) << 2;
            tree = new int[len - 1];
            this.rawLen = rawLen;
            Arrays.fill(tree, Integer.MAX_VALUE);
        }

        public int query(int left, int right) {
            return query(1, 0, rawLen - 1, left, right);
        }

        public void update(int idx, int newValue) {
            update(idx, newValue, 1, 0, rawLen - 1);
        }

        /**
         * Invariant: rangeBegin <= left <= right <= rangeEnd
         */
        private int query(int idx, int rangeBegin, int rangeEnd, int left, int right) {
            Integer leftResult = null;
            Integer rightResult = null;
            if (rangeBegin == rangeEnd) {
                return tree[idx];
            }
            int rangeMid = (rangeBegin + rangeEnd) / 2;
            if (left <= rangeMid) {
                leftResult = query(idx * 2, rangeBegin, rangeMid, left, Math.min(right, rangeMid));
            }
            if (rangeMid + 1 <= right) {
                rightResult = query(idx * 2 + 1, rangeMid + 1, rangeEnd, Math.max(left, rangeMid + 1), right);
            }
            if (leftResult == null) {
                return rightResult;
            } else if (rightResult == null) {
                return leftResult;
            } else {
                return Math.min(leftResult, rightResult);
            }
        }

        private void update(int idxToUpdate, int newValue, int idx, int rangeBegin, int rangeEnd) {
            if (rangeBegin == rangeEnd) {
                tree[idx] = newValue;
            } else {
                int rangeMid = (rangeBegin + rangeEnd) / 2;
                if (idxToUpdate > rangeMid) {
                    update(idxToUpdate, newValue, idx * 2 + 1, rangeMid + 1, rangeEnd);
                } else {
                    update(idxToUpdate, newValue, idx * 2, rangeBegin, rangeMid);
                }
                tree[idx] = tree[idx * 2] < tree[idx * 2 + 1] ? tree[idx * 2] : tree[idx * 2 + 1];
            }
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        SegmentTree segTree = new SegmentTree(n);
        int q = scanner.nextInt();
        while (q-- > 0) {
            int cmd = scanner.nextInt();
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            if (cmd == 0) { // update
                segTree.update(x, y);
            } else { // query
                System.out.println(segTree.query(x, y));
            }
        }
    }
}