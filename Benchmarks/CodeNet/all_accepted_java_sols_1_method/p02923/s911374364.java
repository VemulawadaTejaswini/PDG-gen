import java.util.Scanner;

class Main {
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] h = new int[n];
        for (int i = 0; i< n; i++) {
            h[i] = scan.nextInt();
        }
        int ans = 0;
        int len = 0;
        for (int i = 0; i< n-1; i++) {
            if (h[i] >= h[i+1]) {
                len++;
            } else {
                ans = Math.max(ans, len);
                len = 0;
            }
        }
        ans = Math.max(ans, len);

        System.out.println(ans);
    }

}