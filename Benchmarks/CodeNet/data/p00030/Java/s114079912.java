import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int n,s,ans;

	public static void main(String[] args) throws IOException {

		String str;

		while(!(str=br.readLine()).equals("0 0")){
			String strArray[] = str.split(" ");
			n = Integer.parseInt(strArray[0]);
			s = Integer.parseInt(strArray[1]);
			solve();
		}

	}

	static void solve(){
		ans=0;
		cal(0, n, 0);
		System.out.println(ans);
	}

	static void cal(int i, int n, int sum){
		if(n==0){
			if(sum==s){
				ans++;
				return;
			}
		}

		if(i>9)return;
		for(int k=i; k<=9; k++){
			cal(k+1, n-1, sum+k);
		}
	}
}