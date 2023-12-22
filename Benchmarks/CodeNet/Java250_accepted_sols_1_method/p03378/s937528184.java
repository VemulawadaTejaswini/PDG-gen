import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        int[] a = new int[m];
        int count = 0;
        for (int i = 0; i < m; i++) {
            a[i] = sc.nextInt();
            if (a[i] < x) {
                count++;
            }
        }
        if (count <= m / 2) {
            System.out.println(count);
        } else {
            System.out.println(m - count);
        }
    }
}