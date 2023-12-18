import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		int num1, num2;
		int flg = 0;
		
		Scanner sc = new Scanner(System.in);

		while(true){
			String formula = sc.nextLine();
			
			String[] operation = formula.split(" ", 0);
			num1 = Integer.parseInt(operation[0]);
			num2 = Integer.parseInt(operation[2]);

			switch(operation[1]){
				case "+":
					System.out.println(num1 + num2);
					break;
				case "-":
					System.out.println(num1 - num2);
					break;
				case "*":
					System.out.println(num1 * num2);
					break;
				case "/":
					System.out.println(num1 / num2);
					break;
				default :
					flg = 1;
					break;
			}
			if(flg == 1) break;
		}

	}
}
