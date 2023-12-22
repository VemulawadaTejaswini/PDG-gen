import java.util.Scanner;

public class Main {



	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] s = sc.next().split("");
		
		String ans = "Yes";
		
		if(s[0].equals(s[1]) && s[1].equals(s[2])) {
			ans = "No";
		}
		
		System.out.println(ans);
	}
}