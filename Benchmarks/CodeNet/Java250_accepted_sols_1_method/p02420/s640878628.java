import java.util.Scanner;

class Main {
  public static void main(String args[]) {
	Scanner scanner = new Scanner(System.in);
	boolean Judge = true;
  	String end = "-";
  	String work;
  	
  	
  	while( Judge ){
		String deck = scanner.next();		//最初の文字
  		//終わる処理と変換
  		if( deck.equals(end) ){
  			Judge = false;
  			break;
  		}
		int shuffle = scanner.nextInt();	//シャッフル回数
  		//シャッフル
  		for( int i = 0; i < shuffle ; i ++ ) {
			int num = scanner.nextInt();	//シャッフル開始位置
			String substr = deck.substring(0, num);
			work = deck.replaceFirst(substr, "");
			deck = work.concat(substr);
  		}
  	  	//結果出力
  		System.out.println(deck);
  	}
  	
	
  	//後処理
	scanner.close();
  }
}
