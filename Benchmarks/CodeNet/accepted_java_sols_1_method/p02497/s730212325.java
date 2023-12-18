import java.text.DecimalFormat;
import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int m = sc.nextInt();
			int f = sc.nextInt();
			int r = sc.nextInt();
			if(m == -1 && f == -1 && r == -1) {
				break;
			}
			
			int mf = m + f;
			
			if(m == -1 || f == -1) {
				System.out.println("F");
			} else if(mf >= 80) {
				System.out.println("A");
			} else if(65 <= mf && mf < 80) {
				System.out.println("B");
			} else if(50 <= mf && mf < 65) {
				System.out.println("C");
			} else if(30 <= mf && mf < 50) {
				if(r >= 50) {
					System.out.println("C");
				} else {
					System.out.println("D");
				}
			} else {
				System.out.println("F");
			}
		}
	}
}