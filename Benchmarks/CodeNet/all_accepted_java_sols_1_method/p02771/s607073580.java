import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
//		String s = sc.next();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if(a==b) {
			if(a!=c) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}else if(a==c) {
			if(a!=b) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}else if(b==c) {
			if(a!=b) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}else {
			System.out.println("No");
		}


	}
}
