import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		int a = 0, b = 0;
		for(int i = 0; i < n; i++) {
			if(s.charAt(i) == '(') a++;
			else {
				if(a > 0) a--;
				else b++;
			}
		}
		for(int i = 0; i < a; i++) s += ")";
		for(int i = 0; i < b; i++) s = "(" + s;
		System.out.println(s);
	}
}
