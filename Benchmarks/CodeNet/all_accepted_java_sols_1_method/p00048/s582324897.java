import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()){

			double num = sc.nextDouble();

			if(num <= 48){
				System.out.println("light fly");
			} else if(48 < num && num <= 51){
				System.out.println("fly");
			} else if(51 < num && num <= 54){
				System.out.println("bantam");
			} else if(54 < num && num <= 57){
				System.out.println("feather");
			} else if(57 < num && num <= 60){
				System.out.println("light");
			} else if(60 < num && num <= 64){
				System.out.println("light welter");
			} else if(64 < num && num <= 69){
				System.out.println("welter");
			} else if(69 < num && num <= 75){
				System.out.println("light middle");
			} else if(75 < num && num <= 81){
				System.out.println("middle");
			} else if(81 < num && num <= 91){
				System.out.println("light heavy");
			} else{
				System.out.println("heavy");
			}
		}
	}
}