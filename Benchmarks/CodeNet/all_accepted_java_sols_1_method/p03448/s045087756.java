import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();// 500
        int b = sc.nextInt();// 100
        int c = sc.nextInt();// 50
        int x = sc.nextInt();
        int count = 0;
        for (int i = 0; i <= c; i++) {
            for (int j = 0; j <= b; j++) {
                for (int k = 0; k <= a; k++) {
                    if ((50 * i) + (100 * j) + (500 * k) == x) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}