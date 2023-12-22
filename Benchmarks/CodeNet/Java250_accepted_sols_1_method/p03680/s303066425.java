import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            int temp = Integer.parseInt(sc.next());
            a[i] = temp - 1;
        }
        int idx = 0;
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            cnt++;
            idx = a[idx];
            if (idx == 1) {
                System.out.println(cnt);
                return;
            } else if (idx == 0) {
                System.out.println(-1);
                return;
            }
        }
        System.out.println(-1);
    }
}