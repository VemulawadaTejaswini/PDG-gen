// ３つの整数 a、b、c を読み込み、a から b までの整数の中に、c の約数がいくつあるかを求めるプログラムを作成してください。
import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String[] split = str.split(" ");
		int a = Integer.parseInt(split[0]);
		int b = Integer.parseInt(split[1]);
		int c = Integer.parseInt(split[2]);
		int flg = 0;

		for(int i=a; i<=b; i++){
			if(c%i == 0){
				flg++;
			}
		}
		System.out.println(flg);

	}
}
