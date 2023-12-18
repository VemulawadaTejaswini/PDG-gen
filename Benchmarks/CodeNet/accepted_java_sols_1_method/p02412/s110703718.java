import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int x;
        

        while (true) {
            n = Integer.parseInt(sc.next());
            x = Integer.parseInt(sc.next());
            int cnt = 0;
            if (n == 0 && x == 0) {
                break;
            }

            for (int i = 1; i <= n; i++) {
                for (int j = i + 1; j <= n; j++) {
                    for (int k = j + 1; k <= n; k++) {
                        if (i + j + k == x) {
                            cnt++;
                        }
                    }
                }
            }
            System.out.println(cnt);
        }

        sc.close();
    }
}
