import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            double a1 = sc.nextInt();
            double b1 = sc.nextInt();
            double c1 = sc.nextInt();
            double a2 = sc.nextInt();
            double b2 = sc.nextInt();
            double c2 = sc.nextInt();

            double a = (a1*b2 - a2*b1);
            double x = (c1*b2 - c2*b1) / a + 0;
            double y = (a1*c2 - a2*c1) / a + 0;
            System.out.printf("%.3f %.3f\n", x, y);
        }
    }
}