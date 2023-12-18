import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        double b_0 = sc.nextDouble();
        long b = (long) (b_0 * 100);

        System.out.println((long) a * b / 100);
        sc.close();
    }
}