import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();

//		W = in.readLine();
//		String[] Ws = W.split(" ");

		int N = Integer.parseInt(W);
		String ans = "No";
		if(N >81){
			ans="No";
		}else{
			for(int a=1;a<10;a++){
				for(int b=1;b<10;b++){
					if(a*b==N){
						ans = "Yes";
						break;
					}
					if(ans.equals("Yes")){
						break;
					}
				}
			}
		}
		System.out.println(ans);
	}
}
