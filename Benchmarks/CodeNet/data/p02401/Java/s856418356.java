import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		do {
			Scanner sc = new Scanner(System.in);
			String st = sc.nextLine();
			String[] str = st.split(" ");

			int a = Integer.parseInt(str[0]);
			int b = Integer.parseInt(str[2]);
			int result = 0;

			switch(str[1]) {
				case "+":
					result = a + b;
					break;
				case "-":
					result = a - b;
					break;
				case "*":
					result = a * b;
					break;
				case "/":
					result = a / b;
					break;
				case "?":
					sc.close();
					System.exit(1);
			}

			System.out.println(result);
		}while(true);


	}

}
