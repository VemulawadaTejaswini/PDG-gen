import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		String ans = "NO";
		switch(a + b) {
		case 10 :
			if(a == 5 && b == 5 && c == 7) {
				ans = "YES";
			}
			break;
		case 12 :
			if(a == 5) {
				ans = (b == 7 && c == 5 ? "YES" : "NO");
			} else if(b == 5) {
				ans = (a == 7 && c == 5 ? "YES" : "NO");
			}
			break;
		}
		System.out.println(ans);
	}
}
