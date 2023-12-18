import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

public class Main {

	public static final int BIG_NUM  = 2000000000;
	public static final int MOD  = 1000000007;

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			int M = Integer.parseInt(br.readLine());
			int in_num[] = new int[M];
			int table[][] = new int[M][M]; //自分より遅い人を格納するテーブル
			int index[] = new int[M];


			for(int i = 0; i < M; i++){
				in_num[i] = 0;
				index[i] = 0;
			}

			int N = Integer.parseInt(br.readLine());
			String input_str[] = new String[2];


			int first,second;

			for(int loop = 0; loop < N; loop++){
				input_str = br.readLine().split("\\s+");
				first = Integer.parseInt(input_str[0]);
				second = Integer.parseInt(input_str[1]);
				first--;
				second--;
				in_num[second]++;
				table[first][index[first]++] = second;
			}

			Queue<Integer> Q = new ArrayDeque<Integer>();

			for(int i = 0; i < M; i++){
				if(in_num[i] == 0){
					Q.add(i);
				}
			}

			int tmp;
			StringBuilder ans = new StringBuilder();

			while(!Q.isEmpty()){
				tmp = Q.peek();
				Q.poll();

				ans.append(Integer.toString(tmp+1)).append("\n");

				for(int i = 0; i < index[tmp]; i++){
					in_num[table[tmp][i]]--;
					if(in_num[table[tmp][i]] == 0){
						Q.add(table[tmp][i]);
					}
				}
			}

			System.out.print(ans.toString());


		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}


