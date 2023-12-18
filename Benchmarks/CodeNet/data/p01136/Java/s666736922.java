import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        GatherTheMaps solver = new GatherTheMaps();
        try {
            int testNumber = 1;
            while (true)
                solver.solve(testNumber++, in, out);
        } catch (UnknownError e) {
            out.close();
        }
    }

    static class GatherTheMaps {
        UnionFind uf;

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            if (n == 0) throw new UnknownError();
            ArrayList<ArrayList<Integer>> ar = new ArrayList<>();
            for (int i = 0; i < 30; i++) {
                ar.add(new ArrayList<>());
            }
            for (int i = 0; i < n; i++) {
                int m = in.nextInt();
                for (int j = 0; j < m; j++) {
                    int buf = in.nextInt() - 1;
                    ArrayList<Integer> arbuf = ar.get(buf);
                    arbuf.add(i);
                    ar.set(buf, arbuf);
                }
            }
            uf = new UnionFind(n);
            for (int i = 0; i < 30; i++) {
                for (int j = 0; j < ar.get(i).size(); j++) {
                    for (int k = 0; k < ar.get(i).size(); k++) {
                        if (j != k) {
                            uf.unite(ar.get(i).get(j), ar.get(i).get(k));
                        }
                    }
                }
                if (uf.getSize() == 1) {
                    out.println((i + 1));
                    return;
                }
            }
        }

        public class UnionFind {
            int[] uni;
            int size;

            public UnionFind(int size) {
                this.resize(size);
            }

            void resize(int size) {
                this.size = size;
                this.uni = new int[size];
                Arrays.fill(this.uni, -1);
            }

            int find(int x) {
                if (this.uni[x] < 0) return x;
                return this.uni[x] = this.find(this.uni[x]);
            }

            boolean unite(int x, int y) {
                x = this.find(x);
                y = this.find(y);
                if (x == y) return false;
                if (this.uni[x] > this.uni[y]) {
                    final int buf = x;
                    x = y;
                    y = buf;
                }
                this.uni[x] += this.uni[y];
                uni[y] = x;
                --this.size;
                return true;
            }

            int getSize() {
                return this.size;
            }

        }

    }
}