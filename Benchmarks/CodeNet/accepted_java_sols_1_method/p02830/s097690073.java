import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();

		int N = Integer.parseInt(W);
		W = in.readLine();
		String[] S = W.split(" ");

		String ans ="";
		for(int i=0;i<N;i++){
			ans+=S[0].substring(i,i+1);
			ans+=S[1].substring(i,i+1);
		}

		System.out.println(ans);



	}


}
