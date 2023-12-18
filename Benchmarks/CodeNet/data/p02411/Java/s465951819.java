import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		int f = scan.nextInt();
		int r = scan.nextInt();
		
		while(m != -1) {
			int S = m + f;
			if(S >= 80) {
				System.out.println("A");
			} else if(S >= 65 && S < 80) {
				System.out.println("B");
			} else if(S >= 50 && S < 65) {
				System.out.println("C");
			} else if (S < 30) {
				System.out.println("F");
			} else {
			    if(r >= 50) {
			    	System.out.println("C");
			    } else {
			    	System.out.println("D");
			    }
			}
			m = scan.nextInt();
			f = scan.nextInt();
			r = scan.nextInt();
		}
	}
}