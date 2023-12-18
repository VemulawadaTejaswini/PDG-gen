import java.util.Scanner;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String s = new StringBuilder(sc.next()).reverse().toString();
            if (s.equals("#"))
                break;
            long a = 0;
            long b = 1;
            int n = 0, w = 0;
            char ch = s.charAt(0);
            int ii = 0;
            if (ch == 'h') {
                a = 0;
                n++;
                ii = 5;
            } else {
                a = 90;
                w++;
                ii = 4;
            }
            int cnt=1;
            for (int i = ii; i < s.length();) {
                ch = s.charAt(i);
                long c = 90, d = 0;
                d = (long) Math.pow(2, cnt);
                a = a * d;
                c = c * b;
                b = b * d;
                if (ch == 'h') {
                    a = a - c;
                    i += 5;
                } else {
                    a = a + c;
                    i += 4;
                }
                long gcd = gcd(a, b);
                a /= gcd;
                b /= gcd;
                cnt++;
            }
            if(b==1){
                System.out.println(a);
            } else {
                System.out.println(a+"/"+b);
            }
        }
    }

    static long gcd(long a, long b) {
        if (a < b) {
            long tmp = a;
            a = b;
            b = tmp;
        }
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

}