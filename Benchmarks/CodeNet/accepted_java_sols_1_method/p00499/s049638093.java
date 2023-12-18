import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int j = sc.nextInt() - 1;
        int m = sc.nextInt() - 1;
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(h - Math.max(j / x + 1, m / y + 1));
    }
}
