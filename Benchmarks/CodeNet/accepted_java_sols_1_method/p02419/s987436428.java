import java.util.Scanner;

class Main {
  public static void main(String args[]) {
	Scanner scanner = new Scanner(System.in);
	String search = scanner.nextLine();	//検索文字
	boolean Judge = true;
  	int count = 0;
  	String end = "END_OF_TEXT";
  	
  	
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
  			count++;
  		}
  	}
  	//結果出力
	System.out.println(count);
  	
	scanner.close();
  }
}
