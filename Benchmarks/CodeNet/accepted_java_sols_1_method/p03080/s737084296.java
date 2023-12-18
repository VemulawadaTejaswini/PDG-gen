import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		String N = in.readLine();
		String S = in.readLine();

		int dif=0;
		int n = Integer.parseInt(N);
		for(int i=0;i<n;i++){
			if(S.charAt(i)=='R'){
				dif--;
			}else{
				dif++;
			}
		}
		String ans = "";
		if(dif>=0){
			ans = "No";
		}else{
			ans = "Yes";
		}
		System.out.println(ans);
	}


}
