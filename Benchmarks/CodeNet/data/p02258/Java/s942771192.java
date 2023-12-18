import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main{

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] r = new int[n];

		for(int i = 0; i < n; i++){
			r[i] = Integer.parseInt(br.readLine());
		}

		int min = r[0];
		int max = r[1] - min;

		for(int i = 2; i < n; i++){
			max = Math.max(max, r[i] - min);
			min = Math.min(min, r[i]);
		}

		System.out.println(max);

	}

}