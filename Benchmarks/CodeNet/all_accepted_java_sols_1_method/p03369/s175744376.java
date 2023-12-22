import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		int ans = 700;
		if(S.charAt(0)=='o')ans+=100;
		if(S.charAt(1)=='o')ans+=100;
		if(S.charAt(2)=='o')ans+=100;
		System.out.println(ans);
	}
}