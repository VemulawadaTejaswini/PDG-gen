import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        double b = in.nextDouble();
        long res = (long) (a * b);
        System.out.println((long) Math.floor(res));
    }
}