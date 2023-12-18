
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class Main {

    public static class SegmentTree {

        int[] tree;
        int rawLen;

        public SegmentTree(int n) {
            int len = Integer.highestOneBit(n) << 2;
            tree = new int[len];
            rawLen = n;
            Arrays.fill(tree, Integer.MAX_VALUE);

//            initTree(1, 0, arr.length - 1);
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
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();

        SegmentTree segTree = new SegmentTree(n);
        int q = in.nextInt();
        while (q-- > 0) {
            if (in.nextInt() == 0) { // update
                int idx = in.nextInt();
                int value = in.nextInt();
                segTree.update(idx, value);
            } else { // query
                int l = in.nextInt();
                int r = in.nextInt();
                out.println(segTree.query(l, r));
            }
        }
        out.flush();
    }

    static class InputReader {

        private InputStream in;
        private byte[] buffer = new byte[1024];
        private int curbuf;
        private int lenbuf;

        public InputReader(InputStream in) {
            this.in = in;
            this.curbuf = this.lenbuf = 0;
        }

        public boolean hasNextByte() {
            if (curbuf >= lenbuf) {
                curbuf = 0;
                try {
                    lenbuf = in.read(buffer);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (lenbuf <= 0) {
                    return false;
                }
            }
            return true;
        }

        private int readByte() {
            if (hasNextByte()) {
                return buffer[curbuf++];
            } else {
                return -1;
            }
        }

        private boolean isSpaceChar(int c) {
            return !(c >= 33 && c <= 126);
        }

        private void skip() {
            while (hasNextByte() && isSpaceChar(buffer[curbuf])) {
                curbuf++;
            }
        }

        public boolean hasNext() {
            skip();
            return hasNextByte();
        }

        public String next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            StringBuilder sb = new StringBuilder();
            int b = readByte();
            while (!isSpaceChar(b)) {
                sb.appendCodePoint(b);
                b = readByte();
            }
            return sb.toString();
        }

        public int nextInt() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int c = readByte();
            while (isSpaceChar(c)) {
                c = readByte();
            }
            boolean minus = false;
            if (c == '-') {
                minus = true;
                c = readByte();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res = res * 10 + c - '0';
                c = readByte();
            } while (!isSpaceChar(c));
            return (minus) ? -res : res;
        }

        public long nextLong() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int c = readByte();
            while (isSpaceChar(c)) {
                c = readByte();
            }
            boolean minus = false;
            if (c == '-') {
                minus = true;
                c = readByte();
            }
            long res = 0;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res = res * 10 + c - '0';
                c = readByte();
            } while (!isSpaceChar(c));
            return (minus) ? -res : res;
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        public BigInteger nextBigInteger() {
            return new BigInteger(next());
        }

        public int[] nextIntArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = nextInt();
            }
            return a;
        }

        public long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = nextLong();
            }
            return a;
        }

        public char[][] nextCharMap(int n, int m) {
            char[][] map = new char[n][m];
            for (int i = 0; i < n; i++) {
                map[i] = next().toCharArray();
            }
            return map;
        }
    }
}