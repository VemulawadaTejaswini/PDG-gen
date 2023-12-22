import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//標準入力取得インスタンス生成
		Scanner sc = new Scanner (System.in);
		
		//とる枚数
		int takeCard = sc.nextInt();
		int[] arrayCard = new int[takeCard];
		int box = 0;
		
		//Alice合計
		int sumAlice = 0;
		//Bob合計
		int sumBob = 0;
		
		if(takeCard >= 1 && takeCard <= 100) {
			
			//取ったカードの枚数だけ、配列に格納
			for(int i = 0; i < takeCard; i++) {
				arrayCard[i] = sc.nextInt();
			}
			
			//arrayCardを大きい順にソート
			for(int i = 0; i < arrayCard.length; i++) {
				for(int j = i; j < arrayCard.length; j++) {
					if(arrayCard[i] < arrayCard[j]) {
						box = arrayCard[i];
						arrayCard[i] = arrayCard[j];
						arrayCard[j] = box;	
					}
				}
			}
			
			//
			for(int i = 0; i < arrayCard.length; i++) {
				if((i == 0) || (i % 2 == 0)) {
					sumAlice += arrayCard[i];
				}else {
					sumBob += arrayCard[i];
				}
			}
			
			//答え
			int ans = sumAlice - sumBob;
			//標準出力
			System.out.println(ans);
			
		}else {
			System.out.print("制約NG");
		}
		
	    // Scannerインスタンスをクローズ
	    sc.close();
	}

}
