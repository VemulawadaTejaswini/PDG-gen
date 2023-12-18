//分からんわボケーーーーーーーーーーーーーーーーーーーーーーーーーーー！！

import java.util.Scanner;
public class Main {
	
	//累乗判定メソッド
    public static boolean isPower(long num) { 
        if (num == 1) return false;

        for (int n = 2; Math.pow(num, 1.0 / n) >= 2.0; n++) {
            double nThRoot = Math.pow(num, 1.0 / n);
            if (nThRoot - Math.floor(nThRoot) == 0.0)
                return true;
        }

        return false;
    }

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

			long cnt = 0;
			
			long up = 2;
			
			if(isPrimeNumber(n)) {
				System.out.println(cnt+1);
			}else {
				while(n > up) {
						
					if(n % up == 0  && isPower(up)) {
						cnt++;
						n /= up++;
					}else {
						up++;
					}
					
				}
				System.out.println(cnt);
						
			}
			
			
			
		}
		
		
		
	}

}
