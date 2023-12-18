import java.util.*;
public class Main {
	public static void main(String[] args) {
		int a,b,c;
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i <= 6; i++) {
			a = scan.nextInt();
			b = scan.nextInt();
				if(a >= b) {
					c = a - b;
					System.out.println(c);
				}
		}
	}
}