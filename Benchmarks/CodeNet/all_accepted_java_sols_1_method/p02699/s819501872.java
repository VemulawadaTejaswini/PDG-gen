import java.util.Scanner;
public class Main {
	public static void main(String[] args) {

	//変数の読み込み
		Scanner sc = new Scanner(System.in);
		int S = sc.nextInt();
		int W = sc.nextInt();

	//SがWよりも多い場合と、SがW以下の場合で分ける
		if(S > W) {
			System.out.print("safe");
		}
		else {
			System.out.print("unsafe");
		}
	}

}