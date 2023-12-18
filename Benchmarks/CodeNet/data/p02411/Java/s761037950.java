import java.util.Scanner;

public class Main {

	/**成績をつける
	 *
	 * @param args
	 */
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args){
		for(; scan.hasNext();){
			int mid_term = scan.nextInt();
			int fin_term = scan.nextInt();

			int re_test = scan.nextInt();
			//			int mid_term = Integer.parseInt(args[k]);		//中間試験
			//			int fin_term = Integer.parseInt(args[k+1]);		//期末試験
			//
			//			int re_test = Integer.parseInt(args[k+2]);			//再試験

			if(!(mid_term == -1 && fin_term == -1 && re_test == -1)){
				score(mid_term, fin_term, re_test);
			}else{
				//		System.out.println();//おまじない
				break;
			}
		}

	}

	/**
	 * 点数に応じたスコアを出力する
	 * @param mid	中間試験の点数
	 * @param fin	期末試験の点数
	 * @param re	再テストの点数
	 */
	public  static void score(int mid,int fin,int re){

		int sum = mid + fin;
		boolean flag = true;		//受けていない場合

		//期末、中間どちらか受けていない場合は即F
		if(mid == -1 || fin == -1){
			System.out.println("F");
			flag = false;
		}
		//期末、中間を受験している場合
		if(flag){
			if(sum >= 80){

				System.out.println("A");
			}else if(65 <= sum && sum < 80){
				System.out.println("B");
			}else if(50 <= sum && sum <65){
				System.out.println("C");
			}else if(30 <= sum && sum < 50){
				if(re >= 50){
					System.out.println("C");
				}else{
					System.out.println("D");
				}
			}else
				System.out.println("F");
		}
	}
}
