import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        char[] a = new char[n];
        char[] b = new char[n];
        char[] c = s.toCharArray();
        for (int i = 0 ; i < n ; i++) {
            if (i % 2 == 0) {
                a[i] = '0';
                b[i] = '1';
            } else {
                a[i] = '1';
                b[i] = '0';
            }
        }
        int d = 0;
        int e = 0;
        for (int i = 0 ; i < n ; i++) {
            if (a[i] != c[i]) {
                d++;
            }
            if (b[i] != c[i]) {
                e++;
            }
        }

        System.out.println(Math.min(d, e));


    }

}
