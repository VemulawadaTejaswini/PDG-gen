import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	final static long MOD = 1000000007;
	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();

		long N = Long.parseLong(W);
		String A = in.readLine();
		String B = in.readLine();
		String C = in.readLine();

		long ans = 0;
		for(int i=0;i<N;i++){
			if(A.charAt(i)==B.charAt(i) && A.charAt(i)==C.charAt(i)){

			}else if(A.charAt(i)==B.charAt(i) || A.charAt(i)==C.charAt(i) ||B.charAt(i)==C.charAt(i)){
				ans++;
			}else{
				ans+=2;
			}
		}
		System.out.println(ans);
	}
}
