import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String weather = sc.next();
		
		if(weather.equals("SSS")) {
			System.out.println(0);
			return;
		}
		
		if(weather.equals("RRR")) {
			System.out.println(3);
			return;
		}
		
		if(weather.equals("RRS")||weather.equals("SRR")) {
			System.out.println(2);
			return;
		}
		
		System.out.println(1);


		
	}
}