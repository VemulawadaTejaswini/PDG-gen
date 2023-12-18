import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int n = sc.nextInt();
			int x = sc.nextInt();
			int a = 0;
			
			if(n == 0 && x == 0) {
				break;
			}
			
			for(int i1 = 1; i1 < x/3; i1++) {
				for(int i2 = i1+1; i2 < x/2; i2++) {
					if(x-i1-i2 > i2 && x-i1-i2 <= n) {
						a++;
					}
				}
			}
			
			System.out.println(a);
		}
	}
}

