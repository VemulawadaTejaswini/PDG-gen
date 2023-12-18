import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
            double r = sc.nextDouble();

            double area = r*r*Math.PI;
            double cir = 2*r*Math.PI;

            System.out.printf("%.6f %.6f\n",area,cir);
		}
	}
}

