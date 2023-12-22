import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hp = scanner.nextInt();
        int attack = scanner.nextInt();
        System.out.println(divideCeil(hp, attack));
    }

    static int divideCeil(int numerator, int denominator) {
        double a = numerator;
        double b = denominator;
        return (int) Math.ceil(a / b);
    }
}