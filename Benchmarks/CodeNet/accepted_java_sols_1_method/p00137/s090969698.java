import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 1;
        while (n-- > 0) {
            int x = sc.nextInt();
            System.out.println("Case " + c++ + ":");
            for (int i = 0; i < 10; i++) {
                x = x * x / 100 % 10000;
                System.out.println(x);
            }
        }
    }
}
