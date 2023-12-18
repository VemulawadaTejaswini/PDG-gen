import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();

        int n = sc.nextInt();
        int m = sc.nextInt();
        List<Integer>[] lists = new List[n];
        for (int i = 0; i < n; i++) {
            lists[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;

            lists[a].add(b);
            lists[b].add(a);
        }

        int[] ans = new int[n];
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(0);
        while (!queue.isEmpty()) {
            int t = queue.poll();
            for (int i = 0; i < lists[t].size(); i++) {
                int z = (int)lists[t].get(i);
                if (ans[z] != 0)
                    continue;
                ans[z] = t + 1;
                queue.add(z);
            }
        }

        PrintWriter pw = new PrintWriter(System.out);
        boolean isAns = true;
        for (int i = 1; i < n; i++) {
            if (ans[i] == 0) {
                isAns = false;
                break;
            }
            pw.println(ans[i]);
        }

        if (isAns) {
            System.out.println("Yes");
            pw.close();
        } else {
            System.out.println("No");
            pw = null;
        }
    }

    static class MyScanner {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 1 << 15);
        StringTokenizer tokenizer;

        String next() {
            try {
                while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                    tokenizer = new StringTokenizer(reader.readLine());
                }
            } catch (IOException ignored) {
            }
            return tokenizer.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }
    }
}