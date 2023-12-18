import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double S = r * r * Math.PI;
        double L = 2 * r * Math.PI;
        System.out.printf("%.6f %.6f\n", S, L);
    }
}
