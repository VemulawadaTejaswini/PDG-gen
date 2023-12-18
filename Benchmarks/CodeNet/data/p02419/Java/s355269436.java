import java.util.Scanner;

public class Main{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		//一つ目の単語の入力
		String word = scan.nextLine();
		//文章の入力
		String sentenceWord;
		//単語の一致をカウント
		int count = 0;

		while(scan.hasNext()){
			//文章のなかの単語を入力
			sentenceWord = scan.next().toLowerCase();

			// 入力された文章の中の単語がEND_OF_TEXTの時終了
			if (sentenceWord.equals("END_OF_TEXT")) {
				break;
			}
			//単語が一致したときカウント
			if(word.equals(sentenceWord)){
				count++;
			}
		}
		System.out.println(count);
		scan.close();
	}
}

