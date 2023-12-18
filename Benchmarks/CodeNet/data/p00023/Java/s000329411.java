import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            Circle a = new Circle(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
            Circle b = new Circle(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
            double dx = b.x - a.x;
            double dy = b.y - a.y;
            double r = a.r + b.r;
            double d = Math.sqrt(dx * dx + dy * dy);
            if (d > r) {
                System.out.println(0);
            } else {
                if (a.r < b.r && d + a.r < b.r) {
                    System.out.println(-2);
                } else if (a.r > b.r && d + b.r < a.r) {
                    System.out.println(2);
                } else {
                    System.out.println(1);
                }
            }
        }
    }

    static class Circle {
        double x;
        double y;
        double r;

        Circle(double x, double y, double r) {
            this.x = x;
            this.y = y;
            this.r = r;
        }
    }
}


