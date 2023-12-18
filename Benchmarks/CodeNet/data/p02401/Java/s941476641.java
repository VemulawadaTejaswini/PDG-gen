import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Integer> results = new ArrayList<>();
		while(true) {
			
			String[] input = sc.nextLine().split(" ");
			if(input[1].equals("?")) break;
			
			int a = Integer.parseInt(input[0]);
			int b = Integer.parseInt(input[2]);
			
			switch (input[1]) {
			case "+":
				results.add(a + b);
				break;

			case "-":
				results.add(a - b);
				break;
				
			case "*":
				results.add(a * b);
				break;
				
			case "/":
				results.add(a / b);
				break;
				
			default:
				break;
			}
			
		}
		sc.close();
		
		results.forEach(System.out::println);
		
	}

}