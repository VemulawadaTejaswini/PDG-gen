import java.io.PrintWriter;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		//入力
		long a = sc.nextLong();
		long b = sc.nextLong();
		sc.close();

		//処理
		boolean f = (Math.abs(a-b) > 1);

		//出力	
		out.println(f ? "Alice" : "Brown");
		out.flush();
	}
}