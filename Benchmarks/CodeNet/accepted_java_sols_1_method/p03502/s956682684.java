import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		//String input = args[0];
		
		int num = Integer.parseInt(input);
		
		
		int total = 0;
		for (int i = 0; i < input.length(); i++) {
			String string = input.substring(i, i+1);
			total += Integer.parseInt(string);
		}
		
		if (num%total==0) {
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
		
		scanner.close();
	}

}