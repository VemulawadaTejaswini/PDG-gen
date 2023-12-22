import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int N = (int) 1e5 + 5;
        BigInteger max = new BigInteger("1000000000000000000");
        BigInteger[] A = new BigInteger[N];
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int flag = 0, flag1 = 0;
        for (int i = 0; i < n; i++) {
            A[i] = in.nextBigInteger();
            if (A[i].compareTo(max) == 1) {
                flag = 1;
            }
            if (A[i].compareTo(new BigInteger("0")) == 0) {
                flag1 = 1;
            }
        }
        BigInteger m = new BigInteger(String.valueOf(1));
        if (flag1 == 1) {
            System.out.println("0");
        } else if (flag == 1) {
            System.out.println("-1");
        } else {
            for (int i = 0; i < n; i++) {
                m = m.multiply(A[i]);
//            System.out.println(m.compareTo(max));
                if (m.compareTo(max) == 1) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 1) {
                System.out.println("-1");
            } else {
                System.out.println(m);
            }
        }


    }
}
