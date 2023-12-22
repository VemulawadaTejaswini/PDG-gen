import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();

//		W = in.readLine();
		String[] Ws = W.split(" ");

		int A = Integer.parseInt(Ws[0]);
		int B = Integer.parseInt(Ws[1]);

		if(A >= 10 || B >= 10){
			System.out.println(-1);
		}else{
			System.out.println(A*B);
		}

	}
}
