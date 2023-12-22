import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		String str1 = scan.nextLine();
		String str2 = scan.nextLine();
		scan.close();

		int n = Integer.parseInt(str1);
		String[] num = str2.split(" ", 0);
		ArrayList<String> numList = new ArrayList<String>();

		for (int i = 0; i < n; i++) {
			numList.add(num[i]);
		}

		for (int i = n - 1; 0 <= i; i--) {
			System.out.print(numList.get(i));
			if (i != 0) {
				System.out.print(" ");
			}else{
				System.out.println("");
			}
		}
	}
}