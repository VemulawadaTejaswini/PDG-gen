import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String s = null;
		
		try {
			String[] sp = scanner.nextLine().split(" ");
			s = sp[0];
		} catch (NumberFormatException e) {
		} catch (NullPointerException e) {
		}

		if(s.equals("Sunny")) {
			s = "Cloudy";
		}else if(s.equals("Cloudy")) {
			s = "Rainy";
		}else {
			s = "Sunny";
		}
		
		scanner.close();
		
	 	System.out.println(s);
	}
}
