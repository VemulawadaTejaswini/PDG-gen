import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while( scan.hasNextInt() ) {
			int d = scan.nextInt();
			int s = 0;
			
			for(int i = 1; (600 - i*d) > 0; i++) {
				s += Math.pow(d*i,2) * d;
			}
			
			System.out.println(s);
		}
	}
}