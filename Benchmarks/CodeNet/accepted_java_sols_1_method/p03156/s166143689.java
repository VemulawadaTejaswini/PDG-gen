import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = scanner.nextInt();
        }
        int min = 0;
        int mid = 0;
        int max = 0;

        for (int i = 0; i < n; i++) {
            if (p[i] <= a) {
                min++;
            } else if (p[i] <= b) {
                mid++;
            } else {
                max++;
            }
        }

        int ans = min;

        if (mid < ans) {
            ans = mid;
        }
        if (max < ans) {
            ans = max;
        }

        System.out.println(ans);
    }

}
