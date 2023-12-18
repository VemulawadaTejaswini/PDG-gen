import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String[] data;
		
		Scanner scanner = new Scanner(System.in);
		
	
		while(scanner.hasNext()) {
			data = scanner.nextLine().split(" ");
			int dataInt = Integer.parseInt(data[0]) + Integer.parseInt(data[1]);
			System.out.println(String.valueOf(dataInt).length());
		}
		
		scanner.close();
		
	}

}