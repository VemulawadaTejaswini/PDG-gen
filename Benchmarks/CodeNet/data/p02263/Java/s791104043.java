
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String line = input.nextLine();
		Scanner lineReader = new Scanner(line);
	
		ArrayList<Integer> values = new ArrayList<>();
		ArrayList<String> operations = new ArrayList<>();
		while (lineReader.hasNext()) {
			if (lineReader.hasNextInt()) {
				int val = lineReader.nextInt();
				values.add(val);
			} else {
				
				String operator = lineReader.next();
				int a = values.remove(values.size() - 1);
				int b = values.remove(values.size() - 1);
				
				int c;
				switch (operator) {
				case "+":
					c = a + b;
					break;
				case "-":
					c = b - a;
					break;
				case "*":
					c = a * b;
					break;
				default:
						c = -1;
					
				}
				values.add(c);
			}
		}
		
		System.out.println(values.get(0));
	}
}

