import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double r,x,y;
			r = scanner.nextDouble();
		    x=r*r*Math.PI;
		    y=2*r*Math.PI;
            System.out.printf("%f %f\n",x,y);
	}
}
