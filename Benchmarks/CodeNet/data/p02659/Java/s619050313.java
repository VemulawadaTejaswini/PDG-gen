import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        double b = sc.nextDouble();
        double ans = a*b;
        long ansInt = (long)ans;

        System.out.println(ansInt);
    }
}
