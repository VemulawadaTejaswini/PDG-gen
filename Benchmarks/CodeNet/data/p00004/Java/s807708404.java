import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int d = scanner.nextInt();
            int e = scanner.nextInt();
            int f = scanner.nextInt();

            Equation equation_1 = new Equation(a, b, c);
            Equation equation_2 = new Equation(d, e, f);

            double[] solution = solve(equation_1, equation_2);

            System.out.println(solution[0] + " " + solution[1]);
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

    Equation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int a;
    public int b;
    public int c;

}