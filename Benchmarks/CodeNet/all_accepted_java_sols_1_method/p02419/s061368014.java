import java.util.Scanner;

class Main {
  public static void main(String args[]) {
	Scanner scanner = new Scanner(System.in);
	String search = scanner.nextLine();	//検索文字
	boolean Judge = true;
  	int count = 0;
  	int count2 = 0;
  	int wordlengh,minlength;
  	String end = "END_OF_TEXT";
  	String work;
  	
  	
  	while( Judge ){
		String word = scanner.next();	//文章入力
  		//終わる処理と変換
  		int result = word.lastIndexOf(end);	//検索結果を入れる
  		if( result != -1 ){
  			Judge = false;
  		}else{
  			word = word.toLowerCase(); 		//小文字に
  		}
  		if( word.equals(search) ) {
  			count2++;
  		}
  		//文字列検索
  		wordlengh = word.length();			//元々の文字数
		work = word.replaceAll(search, ""); //検索する文字消す
		minlength = work.length();			//消した時の文字数
		count += ( wordlengh - minlength )/(search.length());	//含まれていた数を足す
  		
  	}
  	//結果出力
	//System.out.println(count);
	System.out.println(count2);
  	
	scanner.close();
  }
}
