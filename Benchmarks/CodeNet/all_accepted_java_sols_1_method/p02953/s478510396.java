import java.io.PrintWriter;
import java.util.Scanner;

public class Main{

	public static void main(String[] args){
		//入力
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int h[] = new int[n];
		for(int i = 0; i < n; i++) h[i] = sc.nextInt();
		sc.close();

		//処理
		String ans = "Yes";
		for(int i = n-2; i >= 0; i--){
			if(h[i] > h[i+1]){
				h[i]--;
			}
		}
		for(int i = 0; i < n-1; i++){
			if(h[i] > h[i+1]) ans = "No";
		}
		
		//出力
		PrintWriter out = new PrintWriter(System.out);
		out.println(ans);
		out.flush();
	}
}