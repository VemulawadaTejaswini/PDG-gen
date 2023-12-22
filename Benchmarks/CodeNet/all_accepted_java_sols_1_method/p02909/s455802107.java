import java.util.Scanner;

public class Main{

	public static void main(String... args){
		Scanner scan = new Scanner(System.in);
		
		String str = scan.next();
		
		switch(str){
			case "Sunny":
				System.out.println("Cloudy");
				break;
			case "Cloudy":
				System.out.println("Rainy");
				break;
			case "Rainy":
				System.out.println("Sunny");
		}
	}
}