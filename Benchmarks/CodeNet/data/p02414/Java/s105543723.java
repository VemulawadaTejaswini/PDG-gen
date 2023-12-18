import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        class Matrix {
            private int x, y;
            private long[][] mat;
            public Matrix(int inX, int inY) {
                x = inX;
                y = inY;
                mat = new long[inX][inY];
            }
            public void set(int x, int y, long num) {
                mat[x][y] = num;
            }
            public long get(int x, int y) {
                return mat[x][y];
            }
            public int getX() { return x;}
            public int getY() { return y;}
            public Matrix mult(Matrix matB) {
                int ax = this.getX(), ay = this.getY();
                int bx = matB.getX(), by = matB.getY();
                Matrix ans = new Matrix(ax, by);

                for (int i = 0; i < ax; i++) {
                    for (int j = 0; j < by; j++) {
                        long sum = 0;
                        for (int k = 0; k < ay; k++) {
                            sum += this.get(i, k) * matB.get(k, j);
                        }
                        ans.set(i, j, sum);
                    }
                }

                return ans;
            }
        }
        Scanner scan = new Scanner(System.in);
        Matrix matA, matB, ans;
        int n, m, l;
        n = Integer.parseInt(scan.next());
        m = Integer.parseInt(scan.next());
        l = Integer.parseInt(scan.next());

        matA = new Matrix(n, m);
        matB = new Matrix(m, l);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matA.set(i, j, Long.parseLong(scan.next()));
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < l; j++) {
                matB.set(i, j, Long.parseLong(scan.next()));
            }
        }
        ans = matA.mult(matB);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < l; j++) {
                System.out.print(ans.get(i, j));
                if (j != l - 1) System.out.print(" ");
            }
            System.out.print("\n");
        }

    }
}

