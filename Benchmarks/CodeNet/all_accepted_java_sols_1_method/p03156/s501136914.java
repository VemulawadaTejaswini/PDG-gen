import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Stream;

public class Main{

	public static void main(String[] args) {

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


			String line = br.readLine();
			int N = Integer.parseInt(line);
			line = br.readLine();
			String[] strs = line.split(" ");//区切りで変える
			int A = Integer.parseInt(strs[0]);
			int B = Integer.parseInt(strs[1]);
			line = br.readLine();
			strs = line.split(" ");

			int[] Ps = Stream.of(strs).mapToInt(Integer::parseInt).toArray();
			Arrays.sort(Ps);
			int[] judge_array = new int[3];
			int judge_a = 0;
		    int judge_b = 0;
			int judge_c = 0;

			for(int i = 0;i<N;i++) {
				int judge = Ps[i];

				if(judge<=A) {
					judge_a++;
				}else if(A+1<=judge && judge<=B) {
					judge_b++;
				}else if(B+1<=judge) {
					judge_c++;
				}

			}
			judge_array[0] = judge_a;
			judge_array[1] = judge_b;
			judge_array[2] = judge_c;
			int ans = judge_a;
			for(int i = 0;i<judge_array.length;i++) {
				ans = Math.min(ans, judge_array[i]);

			}

			System.out.println(ans);

		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}


	}

}
