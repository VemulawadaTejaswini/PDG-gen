

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main{

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		for (int j = 0; j < N; j++) {
			String[] arr = br.readLine().split(" ");
			
			int[] lens = new int[3];
			for (int i = 0; i < 3; i++) {
				lens[i] = Integer.parseInt(arr[i]);
			}
			
			Arrays.sort(lens);
			
			if (lens[2] * lens[2] == lens[0] * lens[0] + lens[1] * lens[1]) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}			
		}

	}

}