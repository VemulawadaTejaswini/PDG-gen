import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		boolean ans = false;

		switch (a) {
		case 5:
			if(b ==7) {
				if(c == 5) {
					ans = true;
				}
			}else if(c == 7) {
				if(b == 5) {
					ans = true;
				}
			}
			break;
		case 7:
			if(b == 5 && c == 5) {
				ans = true;
			}
		}
		System.out.println(ans ? "YES" : "NO");
	}

}