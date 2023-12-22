import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		//int n= Integer.parseInt(sc.next());
		//System.out.println(n);


		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


			String line = br.readLine();
			String[] strs = line.split(" ");//区切りで変える

			int N = Integer.parseInt(strs[0]);
			int A = Integer.parseInt(strs[1]);
			int B = Integer.parseInt(strs[2]);

			int max = Math.min(A, B);
			int sum = A+B;
			int min = Math.max(0, sum-N);

			System.out.println(max+" "+min);


		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}


	}

}
