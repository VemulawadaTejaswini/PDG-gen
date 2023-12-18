import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String a = sc.nextLine();
		sc.close();

		if(a.equals("Sunny")){
			System.out.println("Cloudy");
		}else if(a.equals("Cloudy")){
			System.out.println("Rainy");
		}else{
			System.out.println("Sunny");
		}
	}
}