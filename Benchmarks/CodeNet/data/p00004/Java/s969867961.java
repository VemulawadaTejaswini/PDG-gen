import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> coefficient = new ArrayList<Integer>();
        while (scanner.hasNextLine()) {
            for (int i = 0; i < 6; i++) {
                coefficient.add(Integer.parseInt(scanner.next()));
            }
            SimultaneousEquation equation = new SimultaneousEquation(coefficient);
            equation.compute();
            System.out.printf("%.3f %.3f\n", equation.getX(), equation.getY());

            coefficient.clear();
        }
    }

    private static class SimultaneousEquation {
        private double a, b, c, d, e, f, x, y;

        SimultaneousEquation(List<Integer> coefficient) {
            this.a = coefficient.get(0);
            this.b = coefficient.get(1);
            this.c = coefficient.get(2);
            this.d = coefficient.get(3);
            this.e = coefficient.get(4);
            this.f = coefficient.get(5);
        }

        void compute() {
            double molecule = a * e - d * b;
            if (molecule != 0) {
                this.x = (c * e - f * b) / (a * e - d * b);
                this.y = (a * f - d * c) / (a * e - d * b);
            }
        }

        double getX() {
            return this.x;
        }

        double getY() {
            return this.y;
        }
    }
}