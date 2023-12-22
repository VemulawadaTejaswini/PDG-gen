import java.util.Scanner;

public class Main {

	public Main() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			// 整数の入力
			int a,b;
			int result;
			a = sc.nextInt();
			b = sc.nextInt();
			sc.close();
			if(a>=13)result=b;
			else if(a>=6) result=b/2;
			else result=0;

			// 出力

			System.out.println(result);
	}
}