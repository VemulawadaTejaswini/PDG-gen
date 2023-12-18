import java.io.PrintWriter;
import java.util.Scanner;

public class Main{
	static final int MOD = 1000000007;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		//入力
		int w = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();

		//処理

		//出力
		if(Math.abs(a-b) <= w){
			out.println(0);
		}else{
			out.println(Math.min(Math.abs(b - a - w), Math.abs(a - b - w)));
		}
		out.flush();
	}
}