import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();
		String[] Ws = W.split(" ");

		int N = Integer.parseInt(Ws[0]);
		int M = Integer.parseInt(Ws[1]);

		String ans;
		if(N ==M){
			ans="Yes";
		}else{
			ans="No";
		}
		System.out.println(ans);



	}


}
