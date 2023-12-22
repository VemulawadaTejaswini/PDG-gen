import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();

		int s = 0;
		int e = W.length()-1;
		int ans = 0;
		while(s < e){
			if(W.charAt(s) != W.charAt(e)){
				ans ++;
			}
			s++;
			e--;
		}

		System.out.println(ans);



	}


}
