import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		
		int n = scan.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}

		String str = "";

		for (int i = n-1; i >= 0; i--) {
			str += a[i] + " ";
		}

		System.out.println(str.substring(0, str.length()-1));
		scan.close();
	}

}