import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] numArr = str.split("");

		int sum = 0;
		for(String s : numArr) {
			int n = Integer.parseInt(s);
			sum += n;
		}

		if(sum % 9 == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}