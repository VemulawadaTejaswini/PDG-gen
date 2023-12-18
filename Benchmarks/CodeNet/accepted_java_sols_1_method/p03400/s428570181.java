import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int d = sc.nextInt();
        int x = sc.nextInt();

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            cnt++;
            for (int j = 1; j < d; j++) {
                if (a * j + 1 <= d)
                    cnt++;
                else
                    break;
            }
        }
        
        System.out.print(cnt + x);
    }
}
