import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

	public static void main(String[] args) {

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


			String line = br.readLine();
			int N = Integer.parseInt(line);
			line = br.readLine();
			int H = Integer.parseInt(line);
			line = br.readLine();
			int W = Integer.parseInt(line);

			int nh = N-H+1;
			int nw = N-W+1;

			System.out.println(nh*nw);
			//String[] strs = line.split(" ");//区切りで変える
			//int[] ia = new int[strs.length]; for(int i = 0;i<strs.length;i++){ia[i] = Integer.parseInt(strs[i]);}Integer.parseInt
			//Java8
			//int[] ia = Stream.of(strs).mapToInt(Integer::parseInt).toArray();


		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

	}

}
