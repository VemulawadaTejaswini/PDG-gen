import java.util.Scanner;
public class Main {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.printf("%d %d %.9f\n", a / b, a % b, 1.0 * a / b);
    }
}
