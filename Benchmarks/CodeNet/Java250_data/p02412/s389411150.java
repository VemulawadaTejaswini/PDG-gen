import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        while (true) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            if (n == 0 && x == 0) {
                break;
            }
            for (int i = 1; i <= n - 2; i++) {
                for (int j = 2; j <= n - 1; j++) {
                    for (int k = 3; k <= n; k++) {
                        if (i >= j) {
                            j = i + 1;
                        }
                        if (i >= k) {
                            k = i + 1;
                        }
                        if (j >= k) {
                            k = j + 1;
                        }
                        if ((i + j + k) == x) {
                            cnt++;
                        }
                    }
                }
            }
             System.out.println(cnt);
             cnt = 0;
        }
       
    }

}