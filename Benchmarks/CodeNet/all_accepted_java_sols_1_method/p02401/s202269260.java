import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while(true){

			int a = sc.nextInt();
			String option = sc.next();
			int b = sc.nextInt();

			if(option.equals("?"))break;

			int ans = 0;

			switch(option){
			case "+":
				ans = a+b;
				break;
			case "-":
				ans = a-b;
				break;
			case "*":
				ans = a*b;
				break;
			case "/":
				ans = a/b;
				break;
			}

			System.out.println(ans);
		}
	}
}

