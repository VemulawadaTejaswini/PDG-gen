import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while(true) {
			String input = sc.next();
			if(input.equals("0")) break;
			int sum = 0;
			for(int i=0; i<input.length(); i++) {
				sum += Integer.parseInt(input.split("")[i]);
			}
			System.out.println(sum);
		}

		sc.close();

	}

}

