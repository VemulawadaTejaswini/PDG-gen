import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());

		while(N != 0) {
			
			double min = 1000;
			double max = 0;
			double total = 0;
			for (int i = 0; i < N; i++) {
				int point = Integer.parseInt(br.readLine());
				if (min > point) min = point;
				if (max < point) max = point;
				total += point;
			}
			System.out.println((int) Math.floor((total - max - min) / (N-2)));
			
			N = Integer.parseInt(br.readLine());
		}
	}

}