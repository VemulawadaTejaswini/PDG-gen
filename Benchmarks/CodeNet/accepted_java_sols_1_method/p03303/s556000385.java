import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int w = sc.nextInt();
		StringBuilder ans = new StringBuilder();
		for(int i=0;i<s.length();i+=w) {
			ans.append(s.charAt(i));
		}
		System.out.println(ans);
	}
}
