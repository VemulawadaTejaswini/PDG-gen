import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[] s = sc.next().toCharArray();
		
		int cnt = 1;
		for (int i = 1; i < n; i++) {
			if (s[i-1] != s[i])
				cnt++;
		}
		
		System.out.println(cnt);
	}
}
