import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long x = sc.nextLong();
		long y = 100;
		int c = 0;
		
		while(true) {
			if(y >= x) {
				System.out.println(c);
				return;
			}
			y += y / 100;
			c++;
		}
		
	}
}