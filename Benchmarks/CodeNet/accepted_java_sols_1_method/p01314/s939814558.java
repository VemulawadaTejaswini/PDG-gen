import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            
            int ans = 0;
            for (int i = 1; i < n; i++) {
                int tmp = 0;
                for (int j = i; tmp < n; j++) {
                    tmp += j;
                }
                if (tmp == n) {
                    ans++;
                }
            }
            System.out.println(ans);
        }
    }
}