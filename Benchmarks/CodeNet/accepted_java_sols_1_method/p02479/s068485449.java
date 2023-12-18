import java.util.Scanner;

class Main {
    public static void main(String[] args) {
	double r;
	Scanner scan = new Scanner(System.in);
	r = scan.nextDouble();
	System.out.printf("%f %f\n", Math.PI * r * r, 2 * r * Math.PI);
    }
}