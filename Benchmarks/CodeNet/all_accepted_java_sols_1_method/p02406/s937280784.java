import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			if(i%3 == 0) {
				System.out.print(" " + i);
			}else {
				int x = i;
				while(x >= 1) {
					if(x%10 == 3) {
						System.out.print(" " + i);
						break;
					}
					x /= 10;
				}
			}
		}
		System.out.println();
	}
}

