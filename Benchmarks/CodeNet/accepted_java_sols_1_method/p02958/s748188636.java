import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p[] = new int[n];
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
            a[i] = p[i];
        }
        Arrays.sort(a);
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] != p[i]) {
                cnt++;
            }
        }
        if (cnt <= 2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        sc.close();
    }
}
