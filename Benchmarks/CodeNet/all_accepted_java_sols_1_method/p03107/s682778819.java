import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String temp = scanner.nextLine();

		int A = 0;
		int B = 0;

		for(int i = 0; i < temp.length(); i++) {

			int a = temp.charAt(i) - 48;

			if(a == 0) {
				A++;
			}else {
				B++;
			}

		}


		System.out.println(Math.min(A, B) * 2);


	}

}
