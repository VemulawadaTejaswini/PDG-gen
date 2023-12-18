import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {

    int cnt = 0;

    void solve() {
        int n = io.nextInt();
        int[] S = new int[n];
        for (int i = 0; i < n; i++) {
            S[i] = io.nextInt();
        }
        mergeSort(S, 0, S.length);
        System.out.println(Arrays.stream(S).mapToObj(Integer::toString).collect(Collectors.joining(" ")));
        System.out.println(cnt);
    }

    void merge(int[] A, int left, int mid, int right) {
        final int INF = Integer.MAX_VALUE;
        int n1 = mid - left, n2 = right - mid;
        int[] L = new int[n1 + 1], R = new int[n2 + 1];
        for (int i = 0; i < n1; i++) {
            L[i] = A[left + i];
        }
        for (int i = 0; i < n2; i++) {
            R[i] = A[mid + i];
        }
        L[n1] = INF;
        R[n2] = INF;
        int i = 0, j = 0;
        for (int k = left; k < right; k++) {
            cnt++;
            if (L[i] <= R[j]) {
                A[k] = L[i];
                i += 1;
            } else {
                A[k] = R[j];
                j += 1;
            }
        }
    }

    void mergeSort(int[] A, int left, int right) {
        if (left + 1 < right) {
            int mid = (left + right) / 2;
            mergeSort(A, left, mid);
            mergeSort(A, mid, right);
            merge(A, left, mid, right);
        }
    }

    public static void main(String[] args) {
        new Main().solve();
    }

    IO io = new IO();

    class IO {
        private final int SIZE = 1 << 12;
        private final InputStream stream = System.in;
        private final byte[] buffer = new byte[SIZE];
        private int ptr = 0, buffLen = 0;

        private boolean hasNextByte() {
            if (ptr < buffLen) return true;
            ptr = 0;
            try {
                buffLen = stream.read(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            return buffLen > 0;
        }

        private byte readByte() {
            if (hasNextByte()) return buffer[ptr++];
            return -1;
        }

        private boolean isAscii(byte i) {
            return '!' <= i && i <= '~';
        }

        public char nextChar() {
            byte b = readByte();
            while (!isAscii(b)) b = readByte();
            return (char) b;
        }

        public String next() {
            StringBuilder sb = new StringBuilder();
            byte b = readByte();
            while (isAscii(b)) {
                sb.append((char) b);
                b = readByte();
            }
            return sb.toString();
        }

        public int nextInt() {
            return Integer.valueOf(next());
        }

        public long nextLong() {
            return Long.valueOf(next());
        }

        public double nextDouble() {
            return Double.valueOf(next());
        }
    }
}

