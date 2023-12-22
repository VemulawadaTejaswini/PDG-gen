import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();
		String[] Ws = W.split(" ");

		W = in.readLine();
		String[] Ws2 = W.split(" ");
		int[] A = {Integer.parseInt(Ws2[0]),Integer.parseInt(Ws2[1])};
		W = in.readLine();

		if(W.equals(Ws[0])){
			A[0]--;
		}else{
			A[1]--;
		}

		System.out.println(A[0]+" "+A[1]);

	}


}
