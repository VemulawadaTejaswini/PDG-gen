import java.util.*;
import java.lang.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int a[] = new int[n];
        int b[] = new int[n];
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) == 'E') {
                b[0]++;
            }
        }
        for (int i = 1; i < n; i++) {
            if (s.charAt(i - 1) == 'W') {
                a[i] = a[i - 1] + 1;
            } else {
                a[i] = a[i - 1];
            }
            if (s.charAt(i) == 'E') {
                b[i] = b[i - 1] - 1;
            } else {
                b[i] = b[i - 1];
            }
        }
        int c[] = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = a[i] + b[i];
        }
        Arrays.sort(c);
        System.out.println(c[0]);
    }

}