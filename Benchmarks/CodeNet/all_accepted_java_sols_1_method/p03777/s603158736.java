import java.io.PrintWriter;
import java.util.Scanner;

public class Main{
	static final int MOD = 1000000007;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		//入力
		String a = sc.next();
		String b = sc.next();
		sc.close();

		//処理
		String ans;
		if(a.equals("H")){
			if(b.equals("H")){
				ans = "H";
			}else{
				ans = "D";
			}
		}else{
			if(b.equals("H")){
				ans = "D";
			}else{
				ans = "H";
			}
		}

		//出力	
		out.println(ans);
		out.flush();
	}
}