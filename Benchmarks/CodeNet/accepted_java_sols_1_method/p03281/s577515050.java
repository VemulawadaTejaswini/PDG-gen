import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        for (int i = 1; i <= n; i += 2) {
            int tmp = 0;
            for (int j = 1; j < i; j += 2) {
                if(i % j == 0) {
                    tmp++;
                }
            }
            if(tmp == 7) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}