import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		double x1 = stdIn.nextDouble();
		double y1 = stdIn.nextDouble();
		double x2 = stdIn.nextDouble();
		double y2 = stdIn.nextDouble();
		
		System.out.println(Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2)));
	}
}