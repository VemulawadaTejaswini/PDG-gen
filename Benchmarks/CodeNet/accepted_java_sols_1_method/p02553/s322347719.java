import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long b = sc.nextInt();
        long c = sc.nextInt();
        long d = sc.nextInt();

        long max = b*d;
        max = Math.max(max, a*c);
        max = Math.max(max, a*d);
        max = Math.max(max, b*c);

        System.out.println(max);
    }
}