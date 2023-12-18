import java.util.*;

public class Main {
    static int n;
    static int m;
    static int[] a;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        System.out.println((int)((100 * (n - m)  + 1900 * m) * Math.pow(2, (double)m)));
    }
}

