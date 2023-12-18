import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char[] ch = s.toCharArray();
		int ans = 0;
		for (int i = 0; i < 3; i++) {
			if(ch[i] == '1') {
				ans++;
			}
		}
		System.out.println(ans);
	}
}