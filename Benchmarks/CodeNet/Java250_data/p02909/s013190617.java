import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String clima = reader.nextLine();
		if(clima.equals("Sunny")) {
			System.out.println("Cloudy");
		}else if(clima.equals("Cloudy")) {
			System.out.println("Rainy");
		}else {
			System.out.println("Sunny");
		}
	}

}
