import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();

        int n = sc.nextInt();
        int m = sc.nextInt();

        UnionFind unifin = new UnionFind(n);
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt()-1;
            int b = sc.nextInt()-1;

            unifin.unite(a, b);
        }

        int ans = unifin.count() - 1;
        System.out.println(ans);
    }

    static class UnionFind {
        // Parents[i]:iの親の番号 or 根だった場合、ついているノードの数N(-N)
        static List<Integer> Parents = new ArrayList<>();

        // 最初はすべてが根であるとして初期化
        public UnionFind(int N) {
            for (int i = 0; i < N; i++) {
                Parents.add(-1);
            }
        }

        // データが属する木の根を再帰で得る
        public int root(int x) {
            if (Parents.get(x) < 0)
                return x;
            Parents.set(x, root(Parents.get(x)));
            return Parents.get(x);
        }

        // xとyの木を併合
        public void unite(int x, int y) {
            int rx = root(x);
            int ry = root(y);
            if (rx == ry)
                return;

            // yの方が大きい場合は入れ替える
            if (size(rx) < size(ry)) {
                int tmp = rx;
                rx = ry;
                ry = tmp;
            }

            Parents.set(rx, Parents.get(rx) + Parents.get(ry));
            Parents.set(ry, rx);
        }

        // 2つのデータx, yが属する木が同じならtrueを返す
        public boolean same(int x, int y) {
            int rx = root(x);
            int ry = root(y);
            return rx == ry;
        }

        // 頂点の数を返す
        public int size(int x) {
            if (x >= 0)
                x = root(x);
            return Parents.get(x);
        }

        // 根の数
        public int count() {
            int cnt = 0;
            for (int i : Parents) {
                if (i < 0)
                    cnt++;
            }
            return cnt;
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