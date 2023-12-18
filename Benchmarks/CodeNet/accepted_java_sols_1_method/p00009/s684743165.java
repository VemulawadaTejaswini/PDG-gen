import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while( scan.hasNextInt() ) {
			int num = scan.nextInt();
			
			int[] primeList = new int[num+1];
			int cnt = 0;
			
			// 2以上の自然数をすべて1（素数）にする
			for(int i = 2; i <= num; i++) {
				primeList[i] = 1;
			}
			
			for(int i = 2; i <= num; i++) {
				if(primeList[i] == 0);
				else {
					cnt++;
					for(int j = i + i; j <= num; j += i) {
						primeList[j] = 0;
					}
				}
			}
			
			System.out.println(cnt);
			
		}
	}
}