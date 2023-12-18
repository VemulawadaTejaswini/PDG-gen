import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = Integer.parseInt(sc.next());
        int g = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int n = Integer.parseInt(sc.next());
        sc.close();
        int ans = 0;
        for (int i = 0; i <= n; i++) {
            if (i * r > n)
                break;
            for (int j = 0; j <= n; j++) {
                if (i * r + j * g > n)
                    break;
                int c = n - i * r - j * g;
                if (c % b == 0 && c / b <= n)
                    ans++;
            }
        }
        System.out.println(ans);
    }
}