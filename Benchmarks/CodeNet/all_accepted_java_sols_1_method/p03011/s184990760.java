import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		String N = in.readLine();
		String[] tmp = N.split(" ");

		int ans = 0 ;
		int max = 0;

		for(int i=0;i<tmp.length;i++){
			int x = Integer.parseInt(tmp[i]);
			ans +=x;
			if(max < x){
				max = x;
			}
		}
		ans -= max;

		System.out.println(ans);
	}
}
