import java.io.*;
import java.util.StringTokenizer;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    private static StringTokenizer st;

    private static int readInt() throws IOException {
        while (st == null || !st.hasMoreTokens()) st = new StringTokenizer(br.readLine());
        return Integer.parseInt(st.nextToken());
    }

    public static void main(String[] args) throws IOException {
        int N = readInt();
        int M = readInt();
        int K = readInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = readInt();
        }
        int[] b = new int[M];
        for (int i = 0; i < M; i++) {
            b[i] = readInt();
        }
        int maxBooks = 0;
        int minutesLeft = K;
        int aIndex = -1;
        while (aIndex + 1 < N && a[aIndex + 1] <= minutesLeft) {
            aIndex++;
            minutesLeft -= a[aIndex];
        }
        maxBooks = aIndex + 1;

        int bIndex = -1;
        while (minutesLeft > 0) {
            while (bIndex + 1 < M && b[bIndex + 1] <= minutesLeft) {
                bIndex++;
                minutesLeft -= b[bIndex];
            }
            int current = aIndex + bIndex + 2;
            if (maxBooks < current) maxBooks = current;

            if (aIndex >= 0) {
                minutesLeft -= a[aIndex];
                aIndex--;
            } else break;
        }

        pw.println(maxBooks);
        pw.close();
    }
}
