import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        Long c = (long) (a /b);
        Long d = (long) (a % b);
        double e = a / b;
        System.out.println(c + " " + d + " " + String.format("%.8f", e));
    }

}

