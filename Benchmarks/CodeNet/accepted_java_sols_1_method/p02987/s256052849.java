import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner scanner = new Scanner(System.in);
		
		String str = scanner.nextLine();
		scanner.close();
		
		if (str.length() != 4) {
			System.out.println("No");
			return;
		}
		
		char[] ar = str.toCharArray();
		Arrays.sort(ar);
		
		if (ar[0] == ar[1] && ar[2] == ar[3] && ar[0] != ar[2] ) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}