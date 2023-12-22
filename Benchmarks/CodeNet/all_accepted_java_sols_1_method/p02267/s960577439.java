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
			String[] input_S = new String[N];
			int[] array_S = new int[N];

			input_S = br.readLine().split("\\s+");
			for(int i = 0; i < N; i++){
				array_S[i] = Integer.parseInt(input_S[i]);
			}

			int Q = Integer.parseInt(br.readLine());
			String[] input_T = new String[Q];
			int tmp,ans = 0;

			input_T = br.readLine().split("\\s+");
			for(int i = 0; i < Q; i++){
				tmp = Integer.parseInt(input_T[i]);
				for(int k = 0; k < N; k++){
					if(tmp == array_S[k]){
						ans++;
						break;
					}
				}
			}

			System.out.println(ans);

		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}


