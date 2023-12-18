import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

class Main{

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		StringTokenizer st = new StringTokenizer(input, " ");
		int[] x = new int[2];
		int[] y = new int[2];

		for(int i = 0; i < 2; i++){

			x[i] = Integer.parseInt(st.nextToken());
			y[i] = Integer.parseInt(st.nextToken());

		}

		double pow_width = Math.pow(x[1] - x[0], 2);
		double pow_height = Math.pow(y[1] - y[0], 2);
		double distance = Math.sqrt(pow_width + pow_height);

		System.out.printf("%.8f", distance);

	}
}