import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		int k = sc.nextInt();
		char main = s.charAt(k-1);
		String p = "";
		for(int i = 0;i < s.length();i ++) {
			char c = s.charAt(i);
			if(c != main) p += "*";
			else p += c;
		}
		System.out.println(p);
	}
}