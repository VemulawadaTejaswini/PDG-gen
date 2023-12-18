import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	private static final int BIG_NUM  = 2000000000;
	private static final int MOD  = 1000000007;

	private static int N,K;
	private static int array[];

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {

			String tmp_str[] = br.readLine().split("\\s+");
			N = Integer.parseInt(tmp_str[0]);
			K = Integer.parseInt(tmp_str[1]);

			array = new int[N];

			for(int i = 0; i < N; i++){
				array[i] = Integer.parseInt(br.readLine());
			}

			int left = 0,right = 100000*10000,m = (left+right)/2;
			int ans = 100000*10000;

			while(left <= right){

				if(check(m)){
					ans = m;
					right = m-1;
				}else{
					left = m+1;
				}
				m = (left+right)/2;
			}

			System.out.println(ans);

		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static boolean check(int P){

		int item = 0,truck = 0,tmp_sum;

		while(item < N && truck < K){
			tmp_sum = 0;
			while(item < N && tmp_sum + array[item] <= P){
				tmp_sum += array[item];
				item++;
			}
			truck++;
		}

		if(item == N){
			return true;
		}else{
			return false;
		}
	}
}


