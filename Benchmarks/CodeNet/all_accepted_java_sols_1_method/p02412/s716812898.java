import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        int x;
        int cnt;

        while (true) {
            n = sc.nextInt();
            x = sc.nextInt();
            if (0 == n && 0 == x) {
                break;
            }


            cnt = 0;
            int i, j, k;
            for (i = 1; i <= n; i++) {
                for (j = i + 1; j <= n; j++) {
                    for (k = j + 1; k <= n; k++) {
                        if (i+j+k==x) {
                            cnt++;
                        }
                    }
                }


            }
            System.out.println(cnt);
        }
    }
}

