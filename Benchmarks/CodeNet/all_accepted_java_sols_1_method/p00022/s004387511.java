

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main{

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		int n;
		int[] arr = new int[5001];
		
		while ((line = br.readLine()) != null) {
			if (line.equals("0"))
				break;
			
			n = Integer.parseInt(line);
			int sum = 0;
			int a;
			arr[0] = 0;
			for (int i = 1; i <= n; i++) {
				a = Integer.parseInt(br.readLine());
				sum += a;
				arr[i] = sum;
			}
			
//			System.out.println(Arrays.toString(arr));
			
			int ans = -999999999;
			for (int i = 1; i <= n; i++) {
				for (int j = i; j <= n; j++) {
					if (ans < arr[j] - arr[i - 1])
						ans = arr[j] - arr[i - 1];
				}
			}
			
			System.out.println(ans);
		}
	}

}