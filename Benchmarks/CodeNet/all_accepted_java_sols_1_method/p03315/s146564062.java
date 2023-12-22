
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int number = 0;
		String symbol;

		String S = scan.nextLine();

		for (int i = 0; i < 4; i++){
			symbol = S.substring(i, i + 1);
			if (symbol.equals("+")){
				number += 1;
			}else if (symbol.equals("-")) {
				number -= 1;
			}
		}
		System.out.println(number);
	}
}