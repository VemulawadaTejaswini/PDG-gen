import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();
		String[] D = W.split(" ");

		int N = Integer.parseInt(D[0]);
		int A = Integer.parseInt(D[1]);
		int B = Integer.parseInt(D[2]);

		if(N*A < B){
			System.out.println(N*A);
		}else{
			System.out.println(B);
	}


	}


}
