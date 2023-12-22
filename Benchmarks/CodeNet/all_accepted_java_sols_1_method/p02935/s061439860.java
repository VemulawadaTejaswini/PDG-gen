import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        double x = (a[0] + a[1]) / 2.0;
        for (int i = 2; i < n; i++) {
            x = (x + a[i]) / 2;
        }
        System.out.printf("%f\n", x);
    }
}
