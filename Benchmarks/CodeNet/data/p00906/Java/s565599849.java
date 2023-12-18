import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

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
        OneDimensionalCellularAutomaton solver = new OneDimensionalCellularAutomaton();
        try {
            int testNumber = 1;
            while (true)
                solver.solve(testNumber++, in, out);
        } catch (UnknownError e) {
            out.close();
        }
    }

    static class OneDimensionalCellularAutomaton {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            int M = in.nextInt();
            int A = in.nextInt();
            int B = in.nextInt();
            int C = in.nextInt();
            int T = in.nextInt();
            if (N == 0) throw new UnknownError();
            Matrix a = new Matrix(N, N, M);
            for (int i = 0; i < N; i++) {
                a.setCell(i, i, B);
                if (0 < i) {
                    a.setCell(i, i - 1, A);
                }
                if (i < N - 1) {
                    a.setCell(i, i + 1, C);
                }
            }
            Matrix na = Matrix.pow(a, T);
            Matrix s = new Matrix(N, 1, M);
            for (int i = 0; i < N; i++) {
                s.setCell(i, 0, in.nextInt());
            }
            long[][] ans = Matrix.mul(na, s).getArray();
            for (int i = 0; i < N; i++) {
                out.print(ans[i][0]);
                if (i + 1 == N) {
                    out.println();
                } else {
                    out.print(" ");
                }
            }
        }

    }

    static class Matrix {
        private int MOD;
        private long[][] mat;

        public Matrix(int R, int C, int mod) {
            this.mat = new long[R][C];
            this.MOD = mod;
        }

        public Matrix(int R, int C) {
            this.mat = new long[R][C];
            this.MOD = -1;
        }

        public void setCell(int r, int c, long val) {
            if (this.MOD != -1) {
                val %= MOD;
            }
            this.mat[r][c] = val;
        }

        public void addCell(int r, int c, long val) {
            if (this.MOD != -1) {
                val %= MOD;
            }
            this.mat[r][c] += val;
            this.mat[r][c] %= MOD;
        }

        public long[][] getArray() {
            return this.mat.clone();
        }

        public int getRow() {
            return this.mat.length;
        }

        public int getCol() {
            return this.mat[0].length;
        }


        protected Object clone() {
            Matrix ret = new Matrix(mat.length, mat[0].length, MOD);
            ret.mat = this.mat.clone();
            return ret;
        }

        public static Matrix mul(Matrix a, Matrix b) {
            if (a.MOD != b.MOD) throw new IllegalArgumentException();
            if (a.getCol() != b.getRow()) throw new IllegalArgumentException();
            Matrix ret = new Matrix(a.getRow(), b.getCol(), a.MOD);
            for (int i = 0; i < ret.getRow(); i++) {
                for (int j = 0; j < ret.getCol(); j++) {
                    for (int k = 0; k < a.getCol(); k++) {
                        ret.addCell(i, j, a.mat[i][k] * b.mat[k][j]);
                    }
                }
            }
            return ret;
        }

        public static Matrix getIdentityMatrix(int rc, int mod) {
            Matrix ret = new Matrix(rc, rc, mod);
            for (int i = 0; i < rc; i++) {
                ret.setCell(i, i, 1);
            }
            return ret;
        }

        public static Matrix pow(Matrix a, long p) {
            if (a.getCol() != a.getRow()) {
                throw new IllegalArgumentException();
            }
            if (p == 0) {
                return Matrix.getIdentityMatrix(a.getRow(), a.MOD);
            }
            Matrix ret = (Matrix) a.clone();
            if (p % 2 == 0) {
                Matrix t = pow(a, p / 2);
                return mul(t, t);
            } else {
                return mul(a, pow(a, p - 1));
            }
        }

    }
}


