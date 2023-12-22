import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt() - 1;
        }

        sc.close();

        int ans = -1;
        int count = 0;
        int pos = 0;
        for (int i = 0; i < 100000; i++) {
            pos = a[pos];
            count++;
            if (pos == 1) {
                ans = count;
                break;
            }
        }

        System.out.println(ans);
    }
}