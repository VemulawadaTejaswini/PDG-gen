import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		int sum, count = 0;
		int n, x;
		boolean flg = true;
		
		while(true) {
			n = scan.nextInt();
			x = scan.nextInt();
			
			if(n == 0 && x == 0)break;
			
			count = 0;
			
			for(int i = 1; i <= n; i++) {
				sum = i;
				for(int j = 1 + i; j <= n; j++) {
					sum = i;
					if( j != i) {
						sum += j;
						flg = true;
					}else {
						flg = false;
					}
					for(int k = 1 + j; k <= n; k++) {
						if( flg == true) {
							sum = i + j;
							if( i != j && i != k && j != k) {
								sum += k;
								
								if( x == sum) {
									count++;
								}
							}
						}
						
						
					}
				}
			}
			
			System.out.println(count);
			
		}
		
	}
}
