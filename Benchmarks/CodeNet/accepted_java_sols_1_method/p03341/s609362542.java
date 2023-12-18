import java.util.Scanner;

public class Main {
    static char[] s;
    static int[] a;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        s = sc.next().toCharArray();
        a = new int[n+1];
        for (int i = 0; i < n; i++) {
            if(s[i] == 'W') {
                a[i+1] = a[i];
            }
            else {
                a[i+1] = a[i] + 1;
            }
        }
        int min = 100000000;
        for (int i = 0; i < n; i++) {
            int l = i - a[i];
            int r = (a[n] - a[i+1]);
            min =Math.min(min, l+r);
        }
        System.out.println(min);
    }
}
