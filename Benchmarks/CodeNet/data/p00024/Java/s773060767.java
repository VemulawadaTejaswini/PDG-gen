import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		while(stdIn.hasNext()) {
			double underSpeed = stdIn.nextDouble();

			double t = underSpeed / 9.8;
			System.out.println((int)Math.round((4.9 * t * t + 5) / 5));
		}
	}
}