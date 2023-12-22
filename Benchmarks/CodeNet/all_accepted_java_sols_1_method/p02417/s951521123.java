import java.util.Scanner;

public class Main{

	/**入力された文字列のアルファベットの個数を数えて出力。
	 *
	 * @param args
	 */
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args){

		//個数カウント用の配列を設置する
		int[] alpha = new int[27];//0-26
		for(int syoki = 0 ; syoki < 27 ;syoki++){
			alpha[syoki]=0;
		}

		/*文字と数値一覧表
		 * A===10===a
		 * B===11===b
		 * !
		 * !
		 * !
		 * Z===35==z
		 * alpha[0]=a--->Character.getNumericValue('A')-10;
		 * alpha[1]=b--->Character.getNumericValue('B')-10;
		 */

		//個数のカウント
	for(;scan.hasNextLine();){
			int sum=0;
			char[] swap = scan.nextLine().toCharArray();//char型の配列に格納する
			
			

			for(int i = 0;i < swap.length ;i++){
				if(swap[i] != ' '){
					int a = Character.getNumericValue(swap[i]);
				//	System.out.println("aは"+a);
				//	System.out.println("a:" + a);
					if(a >= 10 && a <37){
						alpha[a - 10]++;
					}else{
						//break;
					}
				}
			}
	}
		//A~Zの個数を出力
		char L00 = 'a';
		for(int L01 = 0,i = 0; L01 <= ('z' -'a');L01++,i++){
			System.out.print(L00++);
			System.out.println(" : "+alpha[i]);
		}


	}

}

