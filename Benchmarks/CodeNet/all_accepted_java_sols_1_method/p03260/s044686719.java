import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		String ans = "";
		
		if(a*b % 2 == 0) {
			ans = "No";
		} else {
			ans = "Yes";
		}
		System.out.println(ans);
	}
}
