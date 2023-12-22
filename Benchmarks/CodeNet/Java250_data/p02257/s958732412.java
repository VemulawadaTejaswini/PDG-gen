import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws Exception {
		int n = Integer.parseInt(br.readLine());
		
		int count = 0;
		for(int i = 0; i < n; i++){
			int num = Integer.parseInt(br.readLine());
			if(num == searchMinDivisor(num)){
				count++;
			}
		}
		
		System.out.println(count);
	}
	
	public static long searchMinDivisor(long n){
		long p;
		boolean isSucceed = false;
		for(p = 2; p * p <= n; p++){
			if(n % p == 0){
				isSucceed = true;
				break;
			}
		}
		if(!isSucceed){
			p = n;
		}
		return p;
	}
}

