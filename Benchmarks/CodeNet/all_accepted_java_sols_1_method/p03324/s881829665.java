import java.util.Scanner;

public class Main {	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int d = scan.nextInt();
		int n = scan.nextInt();
		if (d == 0) {
			if (n == 100) {
				System.out.println(n+1);
			} else {
				System.out.println(n);
				return;			
			}
		}
		if (d == 1) {
			if (n == 100) {
				System.out.println((n+1)*100);
			} else {
				System.out.println(n*100);
				return;			
			}
		}
		if (d == 2) {
			if (n == 100) {
				System.out.println((n+1)*10000);
			} else {
				System.out.println(n*10000);
				return;			
			}
		}
	}
}
