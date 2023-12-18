import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main
{
    public static void main(String[] args)
    {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD
    {
        public void solve(int testNumber, Scanner in, PrintWriter out)
        {
            int T = 1;
            while (T-- > 0)
            {
                solveOne(in, out);
            }
        }

        private void solveOne(Scanner in, PrintWriter out)
        {
            int N = in.nextInt();
            int M = in.nextInt();
            UnionFind unionFind = new UnionFind(N);
            while (M-- > 0)
            {
                unionFind.union(in.nextInt() - 1, in.nextInt() - 1);
            }
            int ans = 0;
            for (int root_size : unionFind.root_size)
            {
                ans = Math.max(ans, root_size);
            }
            out.println(ans);
        }

    }

    static class UnionFind
    {
        int conf[];
        int[] root_size;
        int n_components = 0;

        UnionFind(int n)
        {
            conf = new int[n];
            root_size = new int[n];
            for (int i = 0; i < n; i++)
            {
                conf[i] = i;
                root_size[i] = 1;
                n_components++;
            }
        }

        private int root(int i)
        {
            while (i != conf[i])
            {
                i = conf[i];
            }
            return i;
        }

        public void union(int a_id, int b_id)
        {
            int root_a = root(a_id);
            int root_b = root(b_id);
            if (root_a == root_b) return;

            int size_a = root_size[root_a];
            int size_b = root_size[root_b];
            if (size_a < size_b)
            {
                conf[root_a] = root_b;
                root_size[root_a] = 0;
                root_size[root_b] += size_a;
                n_components--;
            } else
            {
                conf[root_b] = root_a;
                root_size[root_b] = 0;
                root_size[root_a] += size_b;
                n_components--;
            }
        }

    }
}

