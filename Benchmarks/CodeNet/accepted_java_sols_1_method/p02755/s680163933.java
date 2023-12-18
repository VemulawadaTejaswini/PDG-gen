import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();

        for (int i = 1; i <= 1009; i++) {
            int x = (int) Math.floor(i * 0.08);
            int y = (int) Math.floor(i * 0.1);
            if (x == a && y == b) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }
}