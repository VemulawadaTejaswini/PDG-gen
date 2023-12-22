import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String[] temp = scanner.nextLine().split(" ");
		int a = Integer.parseInt(temp[0]);
		int b = Integer.parseInt(temp[1]);
		StringBuilder sbA = new StringBuilder();
		StringBuilder sbB = new StringBuilder();

		for(int i = 0; i < b ; i++) {

			sbA.append(String.valueOf(a));

		}
		for(int i = 0; i < a ; i++) {

			sbB.append(String.valueOf(b));

		}

		if(a <= b) {

			System.out.println(sbA.toString());

		}else {

			System.out.println(sbB.toString());

		}
	}
}