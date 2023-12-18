import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = n;
        long ans = 753;
        boolean flag = true;
        long i = 1;
        long kotae = 100000;
        long num = 0;
        while (flag) {
            long sa = m % 1000;
            if (Math.abs(ans - sa) < kotae) {
                kotae = Math.abs(ans - sa);
                num = sa;
            }
            m = m / 10;
            if (m < 10) {
                flag = false;
            }
        }
        System.out.println(Math.abs(ans - num));
    }
}