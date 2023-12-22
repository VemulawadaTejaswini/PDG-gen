import java.io.PrintWriter;
import java.util.Scanner;

public class Main{

	public static void main(String[] args){
		//入力
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		//処理
		int ans = 0;
		for(int i = 1; i <= n; i++){
			String s = Integer.toString(i);
			if(s.length() % 2 == 1) ans++;
		}
		
		//出力
		PrintWriter out = new PrintWriter(System.out);
		out.println(ans);
		out.flush();
	}
}