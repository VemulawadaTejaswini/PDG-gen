import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int ans = 0;
        for(int i=1; i<=n; i++) {
            int cnt = 0;
            if(i % 2 != 0) {
                for(int j=1; j*j<=i; j++) {
                    if(i % j == 0) {
                        cnt++;
                        if(i / j != j) {
                            cnt++;
                        }
                    }
                }
                if(cnt == 8) ans++;
            }
        }
        System.out.println(ans);
    }
}
