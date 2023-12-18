import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true){
			String[] tmpArray = br.readLine().split(" ");

			int n = Integer.parseInt(tmpArray[0]);
			int k = Integer.parseInt(tmpArray[1]);
			
			if(n == 0 && k == 0){
				break;
			}
			
			int[] input = new int[n];
			for(int i = 0; i < n; i++){
				input[i] = Integer.parseInt(br.readLine());
			}
			
			int sum = 0;
			int max = Integer.MIN_VALUE;
			//????????????????????????????¨???????????????????
			for(int i = 0; i < k; i ++){
				sum += input[i];
			}
			max = sum;
			//System.out.println("sum "+sum);
			
			for(int i = 1; i <= n - k; i++){
				sum += input[i + k - 1];
				sum -= input[i - 1];
				
				//System.out.println("sum "+sum);
				if(sum > max){
					max = sum;
				}
			}
			
			System.out.println(max);
			
		}
	}

}