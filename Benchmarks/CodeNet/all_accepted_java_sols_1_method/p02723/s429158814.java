import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	static int[] S ;
	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();

		if(W.charAt(2)==W.charAt(3)&&W.charAt(4)==W.charAt(5)){
			System.out.println("Yes");
		}else{
			System.out.println("No");

		}


	}

}
