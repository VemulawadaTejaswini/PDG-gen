import java.util.Scanner;

class Main4{

	public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double r = scan.nextDouble();

        System.out.printf("%f %f\n", Math.pow(r, 2)*Math.PI, 2*r*Math.PI);
    }
}