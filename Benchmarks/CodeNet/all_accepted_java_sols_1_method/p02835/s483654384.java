import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();

		String[] Ws = W.split(" ");
		int[] A ={Integer.parseInt(Ws[0]),Integer.parseInt(Ws[1]),Integer.parseInt(Ws[2])};

		String ans = "bust";
		if(A[0]+A[1]+A[2] >=22){
			ans = "bust";
		}else{
			ans = "win";
		}


		System.out.println(ans);



	}


}
