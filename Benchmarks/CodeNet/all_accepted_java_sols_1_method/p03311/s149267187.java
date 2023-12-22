import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		String[] tmpArray = br.readLine().split(" ");

		int input[] = new int[n];
		long fixed[] = new long[n];

		for(int i = 0; i < n; i++){
			input[i] = Integer.parseInt(tmpArray[i]);
			fixed[i] = input[i] - (i + 1);
		}

//		//debug
//		for(int i = 0; i < n; i++){
//			System.out.print(fixed[i] + " ");
//		}
//		System.out.println();

		Arrays.sort(fixed);

		long b = fixed[n/2];

		long result = 0;
		for(int i = 0; i < n; i++){
			result += Math.abs(fixed[i] - b);
		}

		System.out.println(result);
	}

}
