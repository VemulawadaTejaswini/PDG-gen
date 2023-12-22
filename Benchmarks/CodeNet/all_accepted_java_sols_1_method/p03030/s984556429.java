import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] book = new String[n];
		for(int i = 1; i <= n; i++) {
			String s = sc.next();
			int temp = sc.nextInt();
			
			s = s + " " + 1/(double)temp  + " "  + i;
			book[i-1] = s;
		}
		Arrays.sort(book);
		for(String ans:book) {
			System.out.println(ans.split(" ")[2]);
		}
	}
}