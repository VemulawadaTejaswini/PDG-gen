import java.util.Scanner;

class Main{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String k = s.next();
		if(k.compareTo("Sunny")==0) {
			System.out.println("Cloudy");
		}
		else if(k.compareTo("Cloudy")==0) {
			System.out.println("Rainy");
		}
		else if(k.compareTo("Rainy")==0) {
			System.out.println("Sunny");
		}
	}
}
