import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();

        int ans = 0;
        for(int i = 1; i <= N; i += 2) {
            int tmp = 0;
            for(int j = 1; j <= i; j++) {
                if(i % j == 0) {
                    tmp++;
                }
            }
            if(tmp == 8) ans++;
        }
        System.out.println(ans);
    }
}