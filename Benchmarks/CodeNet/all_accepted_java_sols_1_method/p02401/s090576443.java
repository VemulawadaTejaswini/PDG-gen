import java.io.BufferedInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {		
		Scanner scanner = new Scanner(new BufferedInputStream(System.in));
		List<String> list = new ArrayList<String>();
		
		while(scanner.hasNext()) {
			String num = scanner.nextLine();
			String[] input = num.split(" ");
			int number1 = Integer.parseInt(input[0]);
			String op = input[1];
			int number2 = Integer.parseInt(input[2]);
			int result = 0;
			if("?" .equals(op)) {
				break;
			}else {
				if(number1 >= 0 && number1 <= 20000 && number2 >= 0 && number2 <= 20000) {
					if("+" .equals(op)) {
						result = number1+number2;
						list.add(String.valueOf(result));
					}else if("-" .equals(op)) {
						result = number1-number2;
						list.add(String.valueOf(result));
					}
					else if("*" .equals(op)) {
						result = number1*number2;
						list.add(String.valueOf(result));
					}
					else if("/" .equals(op)) {
						result = number1/number2;
						list.add(String.valueOf(result));
					}
				}
			}			
		}
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}