import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);

		int dataset = 4;
		double data = 0.0;


		while(stdin.hasNext()) {
			data = stdin.nextDouble();

			if(data <= 48.00) {
				System.out.println("light fly");
			} else if(data <=51.00){
				System.out.println("fly");
			} else if(data > 51.00 && data <=54.00){
				System.out.println("bantam");
			} else if(data > 54.00 && data <=57.00){
				System.out.println("feather");
			} else if(data > 57.00 && data <=60.00){
				System.out.println("light");
			} else if(data > 60.00 && data <=64.00){
				System.out.println("light welter");
			} else if(data > 64.00 && data <=69.00){
				System.out.println("welter");
			} else if(data > 69.00 && data <=75.00){
				System.out.println("light middle");
			} else if(data > 75.00 && data <=81.00){
				System.out.println("middle");
			} else if(data > 81.00 && data <=91.00){
				System.out.println("light heavy");
			} else {
				System.out.println("heavy");
			}
		}


	}

}