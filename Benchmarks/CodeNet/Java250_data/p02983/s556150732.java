import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();
		String[] D = W.split(" ");
		int MOD = 2019;

		long L = Long.parseLong(D[0]);
		long R = Long.parseLong(D[1]);

		long ed = R<L+MOD?R:L+MOD;
		long i = L;

		long ans = MOD;
		for(;i<ed;i++){
			for(long k=i+1;k<=ed;k++){
				long tmp = Long.remainderUnsigned(i*k, MOD);
				if(tmp < ans ){
					ans = tmp;
				}
			}
		}

		System.out.println(ans);

	}


}
