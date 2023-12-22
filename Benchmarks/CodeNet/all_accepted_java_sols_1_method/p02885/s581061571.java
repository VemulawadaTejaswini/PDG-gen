import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();
		String[] N = W.split(" ");
		int ans = Integer.parseInt(N[0])-Integer.parseInt(N[1])*2;
		if(ans <=0){
			ans =0;
		}
		System.out.println(ans);
	}
}
