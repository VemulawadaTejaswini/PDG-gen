import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	final static long MOD = 1000000007;
	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();

		long N = Long.parseLong(W);

		String S = in.readLine();

		int ans = 0;
		boolean[] left = new boolean['z'-'a'+1];
		boolean[] right = new boolean['z'-'a'+1];

		for(int k=1;k<N;k++){
			Arrays.fill(left, false);
			Arrays.fill(right, false);
			for(int i=0;i<N;i++){
				if(i<k){
					left['z'-S.charAt(i)]=true;
				}else{
					right['z'-S.charAt(i)]=true;
				}
			}
			int match=0;
			for(int i=0;i<left.length;i++){
				if(left[i]&&right[i]){
					match++;
				}
			}
			ans = Math.max(ans, match);
		}


		System.out.println(ans);
	}
}
