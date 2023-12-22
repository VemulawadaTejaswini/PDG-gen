import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();
		int N = Integer.parseInt(W);

		long ans =0;
		for(int i=1;i<=N;i++){
			if(String.valueOf(i).length()%2==1)
				ans++;
		}

		System.out.println(ans);


	}

}
