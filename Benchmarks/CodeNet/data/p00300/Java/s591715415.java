import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n, r, t, base;
		
		n = scan.nextInt();
		
		for(int i = 0; i < n; i++) {
			r = scan.nextInt();
			t = scan.nextInt();
			
			base = t / 30 * 5  + r / 100;
			
			if(r % 100 == 0) {
				if(t % 30 == 0) {
					System.out.println(base);
					
				} else {
					System.out.println(base + " " + (base + 5));
					
				}
			} else {
				if(t % 30 == 0) {
					System.out.println(base + " " + (base + 1));
					
				} else {
					System.out.println(base + " " + (base + 1) + " " + (base + 5) + " " + (base + 6));
				}
			}
			
		}
		
		scan.close();
	}
}