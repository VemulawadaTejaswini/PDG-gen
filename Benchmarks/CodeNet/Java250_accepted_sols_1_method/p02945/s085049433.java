import java.io.PrintWriter;
import java.util.Scanner;

public class Main{

	public static void main(String[] args){
		//入力
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();

		//処理
		int ans = Math.max(a-b, Math.max(a+b, a*b));
		
		//出力
		PrintWriter out = new PrintWriter(System.out);
		out.println(ans);
		out.flush();
	}
}