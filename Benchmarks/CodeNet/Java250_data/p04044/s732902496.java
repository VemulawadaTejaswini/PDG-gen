import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int l = scan.nextInt();
		String s[] = new String[n];
		for(int i=0;i<n;i++) {
			s[i]=scan.next();
		}
		scan.close();

		Arrays.sort(s);
		for(int i=0;i<n;i++) {
			System.out.print(s[i]);
		}
		System.out.println();

	}
}
