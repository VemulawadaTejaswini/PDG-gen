import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if (a == 7) {
			if(b == 5 && c == 5) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
		else if (b == 7) {
			if(a == 5 && c == 5) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
		else if(c  == 7) {
			if(a == 5 && b == 5) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
	}
}