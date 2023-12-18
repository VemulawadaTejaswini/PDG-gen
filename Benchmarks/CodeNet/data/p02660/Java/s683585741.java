import java.util.Scanner;
public class Main {

	// 素数判定メソッド
		private static boolean isPrimeNumber(long num )
		{
			// 1以下は素数ではない
			if ( 1 >= num ) return false;

			// 2の場合は素数
			if ( 2 == num ) return true;

			// 素数判定
			int n = (int)Math.sqrt( num );
			for ( int i = 2; i <= n; ++ i ) {
				// 余り0で割り切れるかを判定
				if ( 0 == ( num % i ) ) return false;
			}

			// numが2～nで割り切れなかったので素数
			return true;
		}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		
		long n = stdIn.nextLong();
		
		if(isPrimeNumber(n)) {
			System.out.println(1);
		}else {
			
			if(n % 3 == 0 && n % 2 != 0) { //3で割れる場合
				long cnt = 0;
				
				long up = 3;
				
				while(n > 1) {
					cnt++;
					

					while(n % up != 0 && up < n) {
						up++;
					}
					
					n /= up++;
					
				}
				System.out.println(cnt);
				
			}else { //2で割れる場合
				long cnt = 0;
				
				long up = 2;
				
				while(n > 1) {
					cnt++;
					while(n % up != 0 && up < n) {
						up++;
					}
					
					n /= up++;
					
				}
				System.out.println(cnt);
			}
			
			
		}
		
		
		
	}

}
