import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while( scan.hasNextInt() ) {
			int num = scan.nextInt();
			
			int cnt = 0;
			for(int i = 0; i <= 9; i++) {
				for(int j = 0; j <= 9; j++) {
					for(int k = 0; k <= 9; k++) {
							for(int l = 0; l <= 9; l++) {
								if(i+j+k+l == num) {
									cnt++;
								}
							}
					}
				}
			}
			
			System.out.println(cnt);
		}
	}
}