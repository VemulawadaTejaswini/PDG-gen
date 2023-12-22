import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		String[] kachi = br.readLine().split(" ");
		String[] cost = br.readLine().split(" ");

		int k = 0;
		int c = 0;
		int sum = 0;

		for(int i=0;i<n;i++) {
			k = Integer.parseInt(kachi[i]);
			c = Integer.parseInt(cost[i]);

			if(k-c>0) {
				sum += k-c;
			}

		}


		System.out.println(sum);

	}

}
