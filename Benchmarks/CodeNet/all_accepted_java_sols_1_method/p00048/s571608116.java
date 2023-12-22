import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(true){
			try{
				double a = in.nextDouble();
				if(a <= 48.00){
					System.out.println("light fly");
				}else if(a > 48.00 && a <= 51.00){
					System.out.println("fly");
				}else if(a > 51.00 && a <= 54.00){
					System.out.println("bantam");
				}else if(a > 54.00 && a <= 57.00){
					System.out.println("feather");
				}else if(a > 57.00 && a <= 60.00){
					System.out.println("light");
				}else if(a > 60.00 && a <= 64.00){
					System.out.println("light welter");
				}else if(a > 64.00 && a <= 69.00){
					System.out.println("welter");
				}else if(a > 69.00 && a <= 75.00){
					System.out.println("light middle");
				}else if(a > 75.00 && a <= 81.00){
					System.out.println("middle");
				}else if(a > 81.00 && a <= 91.00){
					System.out.println("light heavy");
				}else if(a > 91.00){
					System.out.println("heavy");
				}
			}catch(Exception e){
				System.exit(0);
			}
		}
	}
}