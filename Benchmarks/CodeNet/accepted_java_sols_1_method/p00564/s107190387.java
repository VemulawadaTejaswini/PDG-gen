import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int x = 0;
        int y = 0;

        if (n % a == 0) x = n/a*b;
        else x = (n/a+1)*b;

        if (n % c == 0) y = n/c*d;
        else y = (n/c+1)*d;

        if (x > y) System.out.println(y);
        else System.out.println(x);
    }
}
