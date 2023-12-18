import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();

		String[] S1 = W.split(" ");

		W = in.readLine();
		String[] S2 = W.split(" ");

		String ans = "0";
		if(S1[0].equals(S2[0])){
			ans = "0";
		}else{
			ans ="1";
		}

		System.out.println(ans);



	}


}
