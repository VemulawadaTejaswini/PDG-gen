import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main{
	public static void main(String args[]){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = new String();

		try{

			while((str = br.readLine()) != null){
				int n = Integer.parseInt(str);
				int count = 0;

				if(n <= 2){
					count = 0;
				}else if(n % 2 == 0){
					//nが偶数の場合は，2の相方だけ調べればいい
					if(isPrime(n-1)) count = 2;
				}else{
					// まず2の相方を調べる
					if(isPrime(n-1)) count = 2;

					// 中心の数が素数かどうか調べる
					int middle = (1 + n) / 2;
					if(isPrime(middle)) count++;

					for(int i = 3; i < middle; i += 2){
						//System.out.println(i + "\t" + (n+1-i));
						if(isPrime(i)&&isPrime(n+1-i)) count += 2;
					}
				}
				System.out.println(count);
			}

		}catch(Exception e){
			System.err.println(e);
		}
	}

	static boolean isPrime(int n){
		if(n % 2 == 0) return false;
		for (int i = 3; i <= n - 1; i += 2){
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}