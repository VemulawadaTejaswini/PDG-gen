import java.util.Scanner;

public class Main{

	/**リング状の文字列の任意の位置から時計回りに連続した
	 * 文字をいくつか選んで特定の文字列が作れるかどうか。
	 * 
	 * @param args
	 */
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args){
		String word_in_s = scan.next();
		String word_search_s = scan.next();
		
//		String word_in_s = args[0];
//		String word_search_s = args[1];

		String word_chain = word_in_s + word_in_s;			//検索文字列を２つつなげた
		int checker =0;

		checker = word_chain.indexOf(word_search_s);
		if(checker != -1){
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}


	}
}

