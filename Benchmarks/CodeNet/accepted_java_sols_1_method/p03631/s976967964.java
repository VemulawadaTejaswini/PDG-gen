import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String N =scanner.nextLine();
		char[] Ns = N.toCharArray();
		
		String ans = "No";
		if (Ns[0]==Ns[2]) {
			ans="Yes";
		}
		
		System.out.println(ans);
		
		scanner.close();

	}

}