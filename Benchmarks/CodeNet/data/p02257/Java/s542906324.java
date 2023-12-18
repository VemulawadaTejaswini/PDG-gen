import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main{

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] x = new int[n];
		int count = 0;

		for(int i = 0; i < n; i++){
			x[i] = Integer.parseInt(br.readLine());
		}

		for(int i = 0; i < n; i++){
			
			if(isPrime(x[i])){
				count++;
			}

		}

		System.out.println(count);

	}

	static boolean isPrime(int x){

		if(x == 2){
			return true;
		}

		if(x < 2 || (x % 2) == 0){
			return false;
		}

		int i = 3;

		while(i <= Math.sqrt(x)){

			if((x % i) == 0){
				return false;
			}

			i += 2;

		}

		return true;

	}

}