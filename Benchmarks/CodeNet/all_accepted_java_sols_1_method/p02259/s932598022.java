import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static final int BIG_NUM  = 2000000000;
	public static final int MOD  = 1000000007;

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			int N = Integer.parseInt(br.readLine());
			if(N == 1){
				System.out.println(br.readLine());
				System.out.println(0);
				return;
			}


			String tmp_str[] = br.readLine().split("\\s+");
			int array[] = new int[N];

			for(int i = 0; i < tmp_str.length; i++){
				array[i] = Integer.parseInt(tmp_str[i]);
			}

			int swap_count = 0,work;

			for(int i = 0; i < N-1; i++){
				for(int k = N-1; k >= i+1; k--){
					if(array[k] < array[k-1]){
						work = array[k-1];
						array[k-1] = array[k];
						array[k] = work;
						swap_count++;
					}
				}
			}

			StringBuilder sb = new StringBuilder();
			sb.append(Integer.toBinaryString(array[0]));
			for(int i = 1; i < array.length; i++){
				sb.append(" ").append(Integer.toString(array[i]));
			}
			System.out.println(sb.toString());
			System.out.println(swap_count);

		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

