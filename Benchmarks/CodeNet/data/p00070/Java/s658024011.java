import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	private static long S;
	private static int N;
	private static int cnt = 0;
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] arrays;
		
		while ((line = br.readLine()) != null) {
			arrays = line.split(" ");
			N = Integer.parseInt(arrays[0]);
			S = Integer.parseInt(arrays[1]);

			if(N<=10){
				comb(0,1,new char[N]);
			}
			System.out.println(cnt);
			cnt = 0;
			
		}
	}
	
	private static void comb(long sum, int n, char[] c){
		
		// ｎ件目は残りをnで割り切れるかどうかのチェックをする
		if(n==N){
			if((S-sum)%n==0){
				long a = (S-sum)/n;
				if(String.valueOf(c).indexOf(String.valueOf(a)) == -1){
					cnt++;
				}
			}
			return;
		}
		
		// 1〜n-1件目は全探索
		for(int i=0;i<=9;i++){
			if(String.valueOf(c).indexOf(String.valueOf(i)) != -1){
				continue;
			}
			else if(sum + i*n <= S && n < N){
				c[n-1] = (char)('0' + i);
				comb(sum+i*n, n+1, c);
				c[n-1] = ' ';
			}
			else if(sum + i*n > S){
				break;
			}
		}
	}
}