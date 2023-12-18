import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b;
        a = scan.nextInt();
        b = scan.nextInt();

        System.out.printf("%d %d %.10f\n", a / b, a % b, (double) a / (double) b);

    }
}
