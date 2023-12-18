import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			double weight = scan.nextDouble();
			if(weight > 91){
				System.out.println("heavy");
			}else if(weight > 81){
				System.out.println("light heavy");
			}else if(weight > 75){
				System.out.println("middle");
			}else if(weight > 69){
				System.out.println("light middle");
			}else if(weight > 64){
				System.out.println("welter");
			}else if(weight > 60){
				System.out.println("light welter");
			}else if(weight > 57){
				System.out.println("light");
			}else if(weight > 54){
				System.out.println("feather");
			}else if(weight > 51){
				System.out.println("bantam");
			}else if(weight > 48){
				System.out.println("fly");
			}else{
				System.out.println("light fly");
			}
		}
	}
}