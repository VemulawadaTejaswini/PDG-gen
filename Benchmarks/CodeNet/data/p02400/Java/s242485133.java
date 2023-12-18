import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		double r = stdIn.nextDouble();
		System.out.println(Math.pow(r,2)*Math.PI+" "+2*r*Math.PI);
	}
}