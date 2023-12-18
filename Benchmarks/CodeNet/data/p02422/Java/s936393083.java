import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int q =sc.nextInt();
		for(int i = 0; i < q; i++) {
			String command = sc.next();
			
			switch(command) {
				case "print": {
					int a =sc.nextInt();
					int b =sc.nextInt();
					pr(a, b, str);
					break;
				}
				case "reverse": {
					int a =sc.nextInt();
					int b =sc.nextInt();
					str = rv(a, b, str);
					break;
				}
				case "replace": {
					int a =sc.nextInt();
					int b =sc.nextInt();
					String p = sc.next();
					str = rp(a, b, p, str);
					break;
				}
			}
		}
		sc.close();
	}
	
	//printメソッド
	static void pr(int a, int b, String str) {
		if(b < str.length()) {
			System.out.println(str.substring(a, b + 1));
		} else {
			System.out.println(str.substring(a));
		}
	}
	//reverseメソッド
	static String rv(int a, int b, String str) {
		if (b < str.length()) {
			String f = str.substring(0, a);
			String l = str.substring(b + 1);
			StringBuilder c = new StringBuilder(str.substring(a, b + 1));
			StringBuilder sb = new StringBuilder();
			sb.append(f);
			sb.append(c.reverse().toString());
			sb.append(l);
			return(sb.toString());
		} else {
			String f = str.substring(0, a);
			StringBuilder c = new StringBuilder(str.substring(a));
			StringBuilder sb = new StringBuilder();
			sb.append(f);
			sb.append(c.reverse().toString());
			return(sb.toString());
		}
	}
	//replaceメソッド
	static String rp(int a, int b, String p, String str) {
		if (b < str.length()) {
			String f = str.substring(0, a);
			String l = str.substring(b + 1);
			StringBuilder sb = new StringBuilder();
			sb.append(f);
			sb.append(p);
			sb.append(l);
			return(sb.toString());
		} else {
			String f = str.substring(0, a);
			StringBuilder sb = new StringBuilder();
			sb.append(f);
			sb.append(f);
			return(sb.toString());
		}
	}
}
