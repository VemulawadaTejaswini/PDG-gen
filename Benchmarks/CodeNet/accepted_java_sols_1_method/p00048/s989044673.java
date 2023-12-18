import java.util.Scanner;

class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		double w;
		
		while(scan.hasNextDouble()){
			w = scan.nextDouble();
			
			if(w <= 48.00)System.out.println("light fly");
			if(w > 48.00 && w <= 51.00)System.out.println("fly");
			if(w > 51.00 && w <= 54.00)System.out.println("bantam");
			if(w > 54.00 && w <= 57.00)System.out.println("feather");
			if(w > 57.00 && w <= 60.00)System.out.println("light");
			if(w > 60.00 && w <= 64.00)System.out.println("light welter");
			if(w > 64.00 && w <= 69.00)System.out.println("welter");
			if(w > 69.00 && w <= 75.00)System.out.println("light middle");
			if(w > 75.00 && w <= 81.00)System.out.println("middle");
			if(w > 81.00 && w <= 91.00)System.out.println("light heavy");
			if(w > 91.00)System.out.println("heavy");
		}
	}
}