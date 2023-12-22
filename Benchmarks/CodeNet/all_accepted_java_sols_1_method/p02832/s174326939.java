import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int j = 1;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if (j == a[i]) {
                j++;
            }
        }
        if (j == 1) {
            System.out.println(-1);
            return;
        }
        System.out.println(n - j + 1);
    }

}
