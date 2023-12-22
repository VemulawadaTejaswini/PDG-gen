// 3の倍数と3のつく数字のときだけ出力するプログラム
import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		int n = Integer.parseInt(str);
		int x = 0;

		for(int i=1; i<=n; i++){
			// 3の倍数処理
			if(( i % 3 ) == 0){
				System.out.print(" " + i);
			}
			// 3のつく数字処理
			else{
				x = i;
				while(true){
					if((x % 10) == 3){
						System.out.print(" " + i);
						break;
					}
					x /= 10;
					if(x == 0) break;
				}
			}
		}
		System.out.println();
	}
}
