import java.util.*;
import java.lang.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s[] = new String[n];
        long m = 0;
        long a = 0;
        long r = 0;
        long c = 0;
        long h = 0;
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
            if (s[i].charAt(0) == 'M') {
                m++;
            } else if (s[i].charAt(0) == 'A') {
                a++;
            } else if (s[i].charAt(0) == 'R') {
                r++;
            } else if (s[i].charAt(0) == 'C') {
                c++;
            } else if (s[i].charAt(0) == 'H') {
                h++;
            }
        }
        System.out.println(m * a * (r + c + h) + m * r * (c + h) + m * c * h + a * r * (c + h) + a * c * h + r * c * h);
    }
}