import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double area = Math.PI * r * r;
        double peri = 2.0 * Math.PI * r;
        System.out.println(String.format("%.6f %.6f", area, peri));
    }
}
