import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        outside:for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (x == 2) {
                ans++;
                continue;
            }
            if (x < 2 || x % 2 == 0)
                continue;
            int j = 3;
            while (j <= Math.sqrt(x)) {
                if (x % j == 0)
                    continue outside;
                j += 2;
            }
            ans++;
        }
        System.out.println(ans);
        sc.close();
    }
}
