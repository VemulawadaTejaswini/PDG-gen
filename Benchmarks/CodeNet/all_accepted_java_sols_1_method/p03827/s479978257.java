import java.util.Scanner;

public class Main {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int l = sc.nextInt();
		String s = sc.next();
		int n = 0;
		int ret = 0;
		for (int i = 0;i < l;i++) {
			char c = s.charAt(i);
			if (c=='I') n++;
			if (c=='D') n--;
			ret = Math.max(ret,n);
		}
		System.out.println(ret);
	}
}
