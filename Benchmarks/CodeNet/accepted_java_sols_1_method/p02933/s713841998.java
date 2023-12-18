import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String S = in.readLine();

		int x = Integer.parseInt(S);
		S = in.readLine();

		if(x <3200){
			System.out.println("red");
		}else{
			System.out.println(S);
		}


	}




}
