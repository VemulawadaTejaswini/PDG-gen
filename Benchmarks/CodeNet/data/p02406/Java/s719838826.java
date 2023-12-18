import java.util.Scanner;

public class Main {
	Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

    	/*Scanner = テキスト入力を扱うためのクラス
		 *キーボードからの入力を受けつける場合は
		 *System.inを使って下記のように記述
		 */
		Scanner scan = new Scanner(System.in);
		int n =scan.nextInt();
		int x;
		int i;

		//for文を設置。初期値として3を用意。
		for(i=3; i<= n; i++){
			x = i;
			if(x%3==0){
				System.out.print(" " + i);
				continue ; //こちらで割り切れたものはwhile文に飛ばす必要はないのでスキップさせる。
			}
			while(x!=0){
				if(x%10==3){
					System.out.print(" " + i);
					break ; //while文を抜けるため
				}
				x = x/10; //これをしないとxがいつまでたっても割られないはず。xの値変更。
			}
		}
		System.out.println();
    }
}