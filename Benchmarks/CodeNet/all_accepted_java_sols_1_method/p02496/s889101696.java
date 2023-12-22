import java.util.Arrays;
import java.util.Scanner;


public class Main {

	static Scanner sc = new Scanner(System.in);
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		final String mark[] = {"S", "H" , "C", "D"};
		
		int n, number;
		String s;
		boolean card[][] = new boolean[4][13];
		
		//カード有無判定の初期化
		for(int i=0; i < card.length; i++){
			Arrays.fill(card[i], false);
		}
		
		n = sc.nextInt();
		
		//すべてのカードがそろっていた場合
		if(n == 52) return;
		
		for(int i=0; i < n; i++){
			s = sc.next();
			number = sc.nextInt() - 1;
			
			if(s.equals(mark[0])){
				card[0][number] = true;
			}
			else if(s.equals(mark[1])){
				card[1][number] = true;
			}
			else if(s.equals(mark[2])){
				card[2][number] = true;
			}
			else if(s.equals(mark[3])){
				card[3][number] = true;
			}
		}
		
		for(int i=0; i < card.length; i++){
			for(int j=0; j < card[i].length; j++){
				if(card[i][j] == false){
					System.out.println(mark[i] + " " + (j + 1));
				}
			}
		}
		

	}

}