import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        int d = a / b;
        int r = a % b;
        double f = (double) a / b;
        System.out.printf("%d %d %f", d, r, f);
    }
}
