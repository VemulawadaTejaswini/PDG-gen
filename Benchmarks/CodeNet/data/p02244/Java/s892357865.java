import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Objects;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author silviase
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        EightQueenPuzzle solver = new EightQueenPuzzle();
        solver.solve(1, in, out);
        out.close();
    }

    static class EightQueenPuzzle {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            Vec2i[] v = new Vec2i[n];
            for (int i = 0; i < n; i++) v[i] = new Vec2i(in.nextInt(), in.nextInt());
            Integer[] p = {0, 1, 2, 3, 4, 5, 6, 7};
            NextPermutation<Integer> np = new NextPermutation<>();

            while (np.nextPermutation(p) != null) {

                // i, p[i]においてあるとする
                // まずは置いてあるものが正しいかどうかの確認をする
                boolean correct = true;
                for (Vec2i vec : v) correct &= p[vec.x] == vec.y;
                if (!correct) continue;

                //out.println(Arrays.toString(p));

                boolean valid = true;

                for (int i = 0; i < 8; i++) {
                    for (int j = i + 1; j < 8; j++) {
                        // i,p[i]とj,p[j]が同じになるのは斜め移動なので、
                        if ((i + p[i]) == (j + p[j])) valid = false;
                        if ((i - p[i]) == (j - p[j])) valid = false;
                    }
                }

                if (valid) {
                    //out.println(Arrays.toString(p));
                    for (int i = 0; i < 8; i++) {
                        for (int j = 0; j < 8; j++) {
                            out.print(j == p[i] ? "Q" : ".");
                        }
                        out.println();
                    }
                    return;
                }
            }
        }

    }

    static class NextPermutation<T extends Comparable<T>> {
        public T[] nextPermutation(T[] array) {
            int k = -1;
            int i = array.length - 2;
            while (i >= 0) {
                if (array[i].compareTo(array[i + 1]) < 0) {
                    k = i;
                    break;
                }
                i--;
            }

            // 存在しない場合nullを返す
            if (k == -1) return null;
            int l = k + 1;
            i = array.length - 1;
            while (i > k + 1) {
                if (array[k].compareTo(array[i]) < 0) {
                    l = i;
                    break;
                }
                i--;
            }

            T tmp = array[k];
            array[k] = array[l];
            array[l] = tmp;
            int[] res = new int[array.length];
            // k+1 <-> n-1
            for (int j = k + 1; j < array.length + k - j; j++) {
                tmp = array[j];
                array[j] = array[array.length + k - j];
                array[array.length + k - j] = tmp;
            }
            return array;
        }

    }

    static class Vec2i {
        public int x;
        public int y;

        public Vec2i(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public String toString() {
            return "Vec2i{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }

        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Vec2i vec2i = (Vec2i) o;
            return x == vec2i.x &&
                    y == vec2i.y;
        }

        public int hashCode() {
            return Objects.hash(x, y);
        }

    }
}


