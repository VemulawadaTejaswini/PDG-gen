import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        double x1, y1, x2, y2;
        Scanner sc = new Scanner(System.in);
        x1 = sc.nextDouble();
        y1 = sc.nextDouble();
        x2 = sc.nextDouble();
        y2 = sc.nextDouble();
        System.out.printf("%.9f\n", Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2)));
    }
}
