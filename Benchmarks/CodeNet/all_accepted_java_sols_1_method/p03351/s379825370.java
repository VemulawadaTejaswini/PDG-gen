import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		//
		Scanner sc = new Scanner(System.in);

		//
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();

		if(a > c) {
			if((a - c) <= d) {
				System.out.println("Yes");
			}
			else if(a > b){
				if((a - b) <= d && (b - c) <= d) {
					System.out.println("Yes");
				}
				else {
					System.out.println("No");
				}
			}else {
				if((b - a) <= d && (b - c) <= d) {
					System.out.println("Yes");
				}
				else {
					System.out.println("No");
				}
			}
		}else {
			if((c - a) <= d) {
				System.out.println("Yes");
			}
			else if(c > b){
				if((c - b) <= d && (b - a) <= d) {
					System.out.println("Yes");
				}
				else {
					System.out.println("No");
				}
			}else {
				if((b - c) <= d && (b - a) <= d) {
					System.out.println("Yes");
				}
				else {
					System.out.println("No");
				}
			}
		}
	}
}