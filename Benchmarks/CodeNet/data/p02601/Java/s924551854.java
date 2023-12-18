import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int ctr = sc.nextInt();
		
		while(ctr > 0) {
			if(b < a) {
				b *= 2;
			}
			else if(c < b) {
				c *= 2;
			}
			ctr--;
		}
		if(b > a && c > b) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}		
	}
}