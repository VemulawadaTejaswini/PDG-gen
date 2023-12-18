import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		double esp = 0.00000001;
		while(cin.hasNext()){
			double w = cin.nextDouble();
			if(w <= 48.00){
				System.out.println("light fly");
			}
			else if(w <= 51.00 && w >= 48.00 + esp){
				System.out.println("fly");
			}
			else if(w <= 54.00 && w >= 51.00 + esp){
				System.out.println("bantam");
			}
			else if(w <= 57.00 && w >= 54.00 + esp){
				System.out.println("feather");
			}
			else if(w <= 60.00 && w >= 57.00 + esp){
				System.out.println("light");
			}
			else if(w <= 64.00 && w >= 60.00 + esp){
				System.out.println("light welter");
			}
			else if(w <= 69.00 && w >= 64.00 + esp){
				System.out.println("welter");
			}
			else if(w <= 75.00 && w >= 69.00 + esp){
				System.out.println("light middle");
			}
			else if(w <=81.00 && w >= 75.00 + esp){
				System.out.println("middle");
			}
			else if(w <= 91.00 && w >= 81.00 + esp){
				System.out.println("light heavy");
			}
			else{
				System.out.println("heavy");
			}
		}
	}

}