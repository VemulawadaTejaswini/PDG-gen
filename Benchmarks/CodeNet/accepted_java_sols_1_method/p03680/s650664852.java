import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt() - 1;
        }
        int x = 0;
        int c = 0;
        for (int i = 0; i < n; i++) {
            c++;
            x = a[x];
            if (x == 1) {
                System.out.println(c);
                return;
            }
        }
        System.out.println("-1");
    }
}