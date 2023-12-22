

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] tmpArray = br.readLine().split(" ");

		int n = Integer.parseInt(tmpArray[0]);
		int t = Integer.parseInt(tmpArray[1]);

		int input[] = new int[n];

		tmpArray = br.readLine().split(" ");

		for(int i = 0; i < n; i++){
			input[i] = Integer.parseInt(tmpArray[i]);
		}

		if(n == 1){
			System.out.println(t);
			return;
		}
		int start = 0;

		long total = 0;
		for(int i = 1; i < n; i++){
			if(input[i] - input[i - 1] > t){
				total += input[i - 1] + t - input[start];
				start = i;
			}

			if(i == n - 1) {
				if(start == n - 1){
					total += t;
				}
				else {
					total += input[i] + t - input[start];
				}
			}

		}

		System.out.println(total);
	}

}
