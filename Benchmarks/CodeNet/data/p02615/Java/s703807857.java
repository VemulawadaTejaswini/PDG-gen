import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    private static StringTokenizer st;

    private static int readInt() throws IOException {
        while (st == null || !st.hasMoreTokens()) st = new StringTokenizer(br.readLine());
        return Integer.parseInt(st.nextToken());
    }

    private static String readToken() throws IOException {
        while (st == null || !st.hasMoreTokens()) st = new StringTokenizer(br.readLine());
        return st.nextToken();
    }

    public static void main(String[] args) throws IOException {
        pw.println(solve());
        pw.close();
    }

    private static long solve() throws IOException {
        int N = readInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = readInt();
        }

        Arrays.sort(A);

        long answer = 0;
        PriorityQueue<IntPair> arrangement = new PriorityQueue<>();
        arrangement.add(new IntPair(A[N-1], A[N-2]));
        arrangement.add(new IntPair(A[N-1], A[N-2]));
        answer += A[N-1];

        for (int i = N-3; i >= 0; i--) {
            IntPair top = arrangement.remove();
            answer += Math.min(top.x, top.y);
            arrangement.add(new IntPair(A[i], top.x));
            arrangement.add(new IntPair(A[i], top.y));
        }

        return answer;
    }

    static class IntPair implements Comparable<IntPair> {
        int x;
        int y;

        public IntPair(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public boolean equals(Object o) {
            IntPair intPair = (IntPair) o;
            return x == intPair.x && y == intPair.y;
        }

        public int hashCode() {
            int result = x;
            result = 31 * result + y;
            return result;
        }

        @Override
        public int compareTo(IntPair o) {
            return Integer.compare(Math.min(o.x, o.y), Math.min(x, y));
        }
    }
}
