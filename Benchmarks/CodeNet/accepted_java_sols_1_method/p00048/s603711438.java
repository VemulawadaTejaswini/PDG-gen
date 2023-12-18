import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 

		while(sc.hasNext()){
			double n = sc.nextDouble();

			if (n <= 48.0){
				System.out.println("light fly");
			}
			else if (48.0 < n && n<= 51.0){
				System.out.println("fly");
			}
			else if (51.0 < n && n<= 54.0){
				System.out.println("bantam");
			}
			else if (54.0 < n && n<= 57.0){
				System.out.println("feather");
			}
			else if (57.0 < n && n<= 60.0){
				System.out.println("light");
			}
			else if (60.0 < n && n<= 64.0){
				System.out.println("light welter");
			}
			else if (64.0 < n && n<= 69.0){
				System.out.println("welter");
			}
			else if (69.0 < n && n<= 75.0){
				System.out.println("light middle");
			}
			else if (75.0 < n && n<= 81.0){
				System.out.println("middle");
			}
			else if (81.0 < n && n<= 91.0){
				System.out.println("light heavy");
			}
			else if (91.0 < n ){
				System.out.println("heavy");
			}

		}
	}
}