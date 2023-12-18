import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        double b = sc.nextDouble();
        long r = a * (long)(b * 100);
        long c = r / 100;
        System.out.println(c);
    }
}