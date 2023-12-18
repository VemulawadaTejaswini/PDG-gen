import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static double weight;
	public static void main(String[] args) {
		while(read()){
		slove();
		}
	}

	static boolean read(){
		if(!sc.hasNextDouble())return false;
		
		weight = sc.nextDouble();
		return true;
	}
	static void slove(){
		//System.out.println(weight);
		if(weight <= 48.00){
			System.out.println("light fly");
		}else if(weight <= 51.00){
			System.out.println("fly");
		}else if(weight <= 54.00){
			System.out.println("bantam");
		}else if(weight <= 57.00){
			System.out.println("feather");
		}else if(weight <= 60.00){
			System.out.println("light");
		}else if(weight <= 64.00){
			System.out.println("light welter");
		}else if(weight <= 69.00){
			System.out.println("welter");
		}else if (weight <= 75.00){
			System.out.println("light middle");
		}else if (weight <= 81.00){
			System.out.println("middle");
		}else if(weight <= 91.00){
			System.out.println("light heavy");
		}else{
			System.out.println("heavy");
		}
	}
}