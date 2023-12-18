import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        int[] a = new int[m];
        for (int i = 0; i < m; i++) {
            a[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < m; i++) {
            if (a[i] < x) {
                count++;
            } else {
                break;
            }
        }
        if (count <= m / 2) {
            System.out.println(count);
        } else {
            System.out.println(m - count);
        }

    }
}