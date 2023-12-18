import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true){
			int n = Integer.parseInt(br.readLine());

			if(n == 0){
				break;
			}

			long[] input = new long[n];
			for(int i = 0; i < n; i++){
				input[i] = Long.parseLong(br.readLine());
			}

			System.out.println(solve(input));;

		}
	}

	static long solve(long[] array){
		int n = array.length;

		long result = Long.MIN_VALUE;
		for(int i = 1; i <= n; i++){

			for(int j = 0; j < n - i; j++){
				long tmpSum = 0;
				for(int k = j; k <= j + i ; k++){
					tmpSum += array[k];
				}
				result = Math.max(result, tmpSum);

			}
		}

		return result;
	}


}

