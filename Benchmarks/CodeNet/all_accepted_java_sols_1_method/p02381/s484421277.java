import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static final int BIG_NUM  = 2000000000;
	public static final int MOD  = 1000000007;

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N;
		double M,SUM;

		try {
			while((N = Integer.parseInt(br.readLine())) != 0){

				String input[] = br.readLine().split("\\s+");
				double array[] = new double[input.length];

				SUM = 0;

				for(int i = 0; i < input.length; i++){
					array[i] = Double.parseDouble(input[i]);
					SUM += array[i];
				}

				M = SUM/(double)N;
				SUM = 0;

				for(int i = 0; i < array.length; i++){
					SUM += (array[i]-M)*(array[i]-M);
				}

				System.out.printf("%.10f\n", Math.sqrt(SUM/(double)N));
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}


