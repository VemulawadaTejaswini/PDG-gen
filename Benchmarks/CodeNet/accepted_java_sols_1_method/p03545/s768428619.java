import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final String S = sc.next();
        sc.close();
        final int A = Integer.parseInt(S.substring(0, 1));
        final int B = Integer.parseInt(S.substring(1, 2));
        final int C = Integer.parseInt(S.substring(2, 3));
        final int D = Integer.parseInt(S.substring(3, 4));

        for (int i=0; i<2; i++) {
            for (int j=0; j<2; j++) {
                    for (int k=0; k<2; k++) {
                        int sum = A;
                        StringBuilder sb = new StringBuilder(A + "+2+3+4=7");
                        if (i==0) {
                            sum += B;
                            sb.replace(1, 3, "+" + B);
                        } else {
                            sum -= B;
                            sb.replace(1, 3, "-" + B);
                        }
                        if (j==0) {
                            sum += C;
                            sb.replace(3, 5, "+" + C);
                        } else {
                            sum -= C;
                            sb.replace(3, 5, "-" + C);
                        }
                        if (k==0) {
                            sum += D;
                            sb.replace(5, 7, "+" + D);
                        } else {
                            sum -= D;
                            sb.replace(5, 7, "-" + D);
                        }
                        if (sum==7) {
                            System.out.println(sb);
                            return;
                        }
                }
            }
        }
    }
}