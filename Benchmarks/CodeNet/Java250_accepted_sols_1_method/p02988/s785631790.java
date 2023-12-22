import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();
		int n = Integer.parseInt(W);

		W = in.readLine();
		String[] p = W.split(" ");

		int ans =0;
		for(int i=2;i<p.length;i++){
			if(Integer.parseInt(p[i-2]) < Integer.parseInt(p[i-1]) && Integer.parseInt(p[i-1]) < Integer.parseInt(p[i])){
				ans++;
			}else if(Integer.parseInt(p[i-2]) > Integer.parseInt(p[i-1]) && Integer.parseInt(p[i-1]) > Integer.parseInt(p[i])){
				ans++;
			}

		}

		System.out.println(ans);

	}


}
