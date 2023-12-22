import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int ans = 0;
        int count = 1;
        for (int i = 0; i < n; i++) {
            if(a[i] == count) {
                count++;
            } else {
                ans++;
            }
        }
        if(ans == n) {
            System.out.println(-1);
        } else {
            System.out.println(ans);
        }
    }
}