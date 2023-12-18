import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextDouble()){
			double a=sc.nextDouble();
			double t=a/9.8;
			double y=4.9*t*t;
			double n=(y+5)/5;
			System.out.println(Math.ceil(n));

		}

	}
}