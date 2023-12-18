import java.io.*;

public class Main {

	final static long MOD = 1000000007;
	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();

		String[] Ws = W.split(" ");
		long x = Long.parseLong(Ws[0]);

		long ans = x/11;
		ans=ans*2;
		if(x%11==0){

		}else if(x%11<=6){
			ans++;
		}else{
			ans+=2;
		}

		System.out.println(ans);
	}
}
