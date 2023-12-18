import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            double c = scanner.nextDouble();
            double d = scanner.nextDouble();
            double e = scanner.nextDouble();
            double f = scanner.nextDouble();

            Equation equation_1 = new Equation(a, b, c);
            Equation equation_2 = new Equation(d, e, f);

            double[] solution = solve(equation_1, equation_2);

            System.out.printf("%.3f %.3f\n", solution[0], solution[1]);
        }
    }

    static double[] solve(Equation left, Equation right) {
        double determinant = left.a * right.b - right.a * left.b;
        double x = (right.b * left.c - left.b * right.c) / determinant;
        double y = (-right.a * left.c + left.a * right.c) / determinant;

        double[] result = { x, y };
        return result;
    }

}

// ax + by = c
class Equation {

    Equation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double a;
    public double b;
    public double c;

}