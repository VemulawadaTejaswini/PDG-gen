import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int r = sc.nextInt();
            ans = Math.max(ans, r - min);
            min = Math.min(min, r);
        }
        System.out.println(ans);
        sc.close();
    }
}
