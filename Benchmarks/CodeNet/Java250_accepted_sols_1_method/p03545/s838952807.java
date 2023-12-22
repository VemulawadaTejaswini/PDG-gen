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

        for (int i=8; i<Math.pow(2.0, 3.0)+8; i++) {
            int sum = A;
            StringBuilder sb = new StringBuilder("" + A);
            if ("1".equals(Integer.toBinaryString(i).substring(3, 4))) {
                sum += B;
                sb.append("+" + B);
            } else {
                sum -= B;
                sb.append("-" + B);
            }
            if ("1".equals(Integer.toBinaryString(i).substring(2, 3))) {
                sum += C;
                sb.append("+" + C);
            } else {
                sum -= C;
                sb.append("-" + C);
            }
            if ("1".equals(Integer.toBinaryString(i).substring(1, 2))) {
                sum += D;
                sb.append("+" + D);
            } else {
                sum -= D;
                sb.append("-" + D);
            }
            if (sum==7) {
                sb.append("=7");
                System.out.println(sb);
                return;
            }
        }
    }
}