import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] a = sc.next().toCharArray();
		char[] b = sc.next().toCharArray();
		
		//System.out.println((a[0] == b[0] ? 1 : 0) + (a[1] == b[1] ? 1 : 0) + (a[2]==b[2] ? 1: 0));
		
		int ans = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == b[i]) ans += 1;
		}

		System.out.println(ans);
	}
}