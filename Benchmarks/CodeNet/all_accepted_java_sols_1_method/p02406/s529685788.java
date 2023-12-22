import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		sc.close();
		
		for(int i = 1; i <= n ;i++) {
			int x = i;
			boolean ok = false;
			
			if(x % 3 == 0) {
				ok = true;
			} else {
				
				while(x > 0) {
					if(x % 10 == 3) {
						ok = true;
						break;
					}
					x /= 10;
				}
				
			}
			
			if(ok) System.out.print(" " + i);
			
		}
                System.out.println();
	}
}