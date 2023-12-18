import java.util.Scanner;

public class Main{

	/**与えられた文字列の大文字と小文字を入れ替える。
	 *
	 * @param args
	 */
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args){

		
		for(;scan.hasNext();){
			char[] swap = scan.nextLine().toCharArray();
		//	char[] swap = scan.next().toCharArray();	//char型の配列に格納する
			for(int i=0;i<swap.length;i++){
				if(Character.isUpperCase(swap[i])){			//大文字の場合
					swap[i] = Character.toLowerCase(swap[i]);
				}else if(Character.isLowerCase(swap[i])){		//小文字の場合
					swap[i] = Character.toUpperCase(swap[i]);
				}else{
					//swap[i];
				}
			}
			StringBuffer sb = new StringBuffer(new String(swap));
			System.out.print(sb.toString());
			System.out.println();
		}
	}
}


