import java.io.*;
import java.util.*;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static StringTokenizer st;

    private static int readInt() throws IOException {
        while (st == null || !st.hasMoreTokens()) st = new StringTokenizer(br.readLine());
        return Integer.parseInt(st.nextToken());
    }

    public static void main(String[] args) throws IOException {
        int N = readInt();
        int[] l = new int[N];
        for (int i = 0; i < N; i++) {
            l[i] = readInt();
        }
        Arrays.sort(l);

        int res = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                for (int k = j + 1; k < N; k++) {
                    if (l[i] < l[j] && l[j] < l[k] && l[i] + l[j] > l[k]) res++;
                }
            }
        }

        System.out.println(res);
    }
}
