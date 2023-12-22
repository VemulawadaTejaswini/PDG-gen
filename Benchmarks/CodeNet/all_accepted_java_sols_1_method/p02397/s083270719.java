import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()) {
			int inputNum1 = sc.nextInt();
			int inputNum2 = sc.nextInt();

			if(inputNum1 < inputNum2) {
				System.out.println(inputNum1+" "+inputNum2);
			}
			else if(inputNum1 > inputNum2) {
				System.out.println(inputNum2+" "+inputNum1);
			}
			else if(inputNum1 == inputNum2 && !(inputNum1 == 0 && inputNum2 == 0)) {
				System.out.println(inputNum1+" "+inputNum2);
			}
			else if(inputNum1 == 0 && inputNum2 == 0) {
				break;
			}
		 }

	}
}