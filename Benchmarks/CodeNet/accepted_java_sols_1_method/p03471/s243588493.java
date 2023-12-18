import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int y = sc.nextInt() / 1000;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; i + j <= n; j++) {
                int k = n - i - j;
                int sum = i * 10 + j * 5 + k;
                if (sum == y) {
                    System.out.println(String.format("%d %d %d", i, j, k));
                    return ;
                }
            }
        }
        System.out.println("-1 -1 -1");
    }

}