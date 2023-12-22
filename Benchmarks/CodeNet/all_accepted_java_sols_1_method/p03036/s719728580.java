import java.util.Scanner;

public class Main {

	public Main() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			// 整数の入力
			int r,d,x;
			int index, result;
			r = sc.nextInt();
			d = sc.nextInt();
			x = sc.nextInt();
			sc.close();
			result=x;
			for(index=0;index<10;index++) {
				result = result * r - d;
				System.out.println(result);
			}

			// 出力

	}
}