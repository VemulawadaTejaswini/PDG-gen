
import java.util.Scanner;

class Main {

    public static void main(String args[]) {
        Scanner Input = new Scanner(System.in);
        int H = Input.nextInt();
        int W = Input.nextInt();
        char[][] A = new char[H][W];
        for (int I = 0; I < H; I++) {
            String S = Input.next();
            for (int J = 0; J < W; J++) {
                if (S.charAt(J) == '.') {
                    A[I][J] = '0';
                } else {
                    A[I][J] = S.charAt(J);
                }
            }
        }

        for (int I = 0; I < A.length; I++) {
            for (int J = 0; J < A[0].length; J++) {
                //System.out.print(A[I][J]);
                if (A[I][J] == '#') {
                    int Z = 0;
                    int X = 0;
                    int C = I + 1;
                    int V = J + 1;
                    if (I - 1 >= 0) {
                        Z = I - 1;
                    }
                    if (J - 1 >= 0) {
                        X = J - 1;
                    }
                    if (I + 1 >= A.length) {
                        C = A.length - 1;
                    }
                    if (J + 1 >= A[0].length) {
                        V = A[0].length - 1;
                    }
                    //System.out.println(Z +" "+X+" "+C+" "+V);
                    for (int K = Z; K <= C; K++) {
                        for (int L = X; L <= V; L++) {
                            if (A[K][L] != '#') {
                                A[K][L]++;
                            }

                        }
                    }
                }
            }
        }
        for (int I = 0; I < A.length; I++) {
            for (int J = 0; J < A[0].length; J++) {
                System.out.print(A[I][J]);
            }
            System.out.println("");
        }
    }
}
