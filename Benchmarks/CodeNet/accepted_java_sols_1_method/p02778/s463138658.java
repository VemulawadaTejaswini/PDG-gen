import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		StringBuilder ans = new StringBuilder(); 
		for(int i = 0; i < s.length();i++) {
			ans.append("x");
		}
		System.out.println(ans);
		sc.close();
	}
}
