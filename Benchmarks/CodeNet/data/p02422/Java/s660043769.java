import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		StringBuilder sb = new StringBuilder(s);
		int n = scan.nextInt();
		for(int i = 0; i < n; i++) {
			String q = scan.next();
			if(q.equals("print")){
				int a = scan.nextInt();
				int b = scan.nextInt();
				System.out.println(sb.toString().substring(a, b + 1));
			}else if(q.equals("replace")) {
				int a = scan.nextInt();
				int b = scan.nextInt();
				String str = scan.next();
				sb.replace(a, b + 1, str);
			}else {
				int a = scan.nextInt();
				int b = scan.nextInt();
				if(a == 0) {
					StringBuilder sb1 = new StringBuilder(sb.substring(a, b + 1));
					sb1.reverse();
					if(b == s.length()) {
						sb = new StringBuilder(sb1.toString());
					}else {
						String t = sb.substring(b + 1, s.length());
						sb = new StringBuilder(sb1.toString() + t);
					}
				}else {
					StringBuilder sb1 = new StringBuilder(sb.substring(a, b + 1));
					sb1.reverse();
					String t = sb.substring(0, a);
					if(b == s.length() - 1) {
						sb = new StringBuilder(t + sb1.toString());
					}else {
						String t2 = sb.substring(b + 1, s.length());
						sb = new StringBuilder(t + sb1.toString() + t2);
					}
				}
			}
		}
		scan.close();
	}
}
