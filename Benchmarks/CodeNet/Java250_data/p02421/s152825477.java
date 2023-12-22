import java.util.Scanner;

class Main {
  public static void main(String args[]) {
	Scanner scanner = new Scanner(System.in);
	int deck = scanner.nextInt();	//ターン数,山札数
	int count = 0;
	int sum_t = 0;
	int sum_h = 0;
  	int Judge = 0;
  	int card_stlength_t;
  	int card_stlength_h;
  	int card_stlength;
  	int case_st = 0;
  	String work_t,work_h;
  	String alf[] = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p",
  			"q","r","s","t","u","v","w","x","y","z"};
  	boolean bJudge = true;
  	
  	
  	do {
		String card_t = scanner.next();	//太郎の文字
		String card_h = scanner.next();	//花子の文字
  		
  		//引き分け
  		if( card_t.equals(card_h) ){
  			Judge = 0;
  		}
  		//カードの文字数取得
  		card_stlength_t = card_t.length();
  		card_stlength_h = card_h.length();
  		
  		if( card_stlength_t == card_stlength_h ){
  			card_stlength = card_stlength_t;
  			case_st = 0;
  		}else if( card_stlength_t > card_stlength_h ){
  			card_stlength = card_stlength_t;
  			case_st = 1;
  		}else{
  			card_stlength = card_stlength_h;
  			case_st = 2;
  		}
  		
  		//カードの比較
  		for( int i = 0; i < card_stlength ; i ++ ) {
		  		//System.out.println("比較判定");
  			if( case_st == 1 && i == card_stlength_h ){
  				Judge = 1;
  		  		//System.out.println("太郎勝ち");
  				break;
  			}else if( case_st == 2 && i == card_stlength_t ){
  				Judge = 2;
  		  		//System.out.println("花子勝ち");
  				break;
  			}else{
	  			work_t = card_t.substring(i, i +1);
	  			int j = 0;
  				int k = 0;
	  			int ncard_t = 0,ncard_h = 0;
  				//太郎の強さ
				while( true  ) {
					ncard_t ++;
					if(work_t.equals( alf[j] ))
						break;
					j ++;
				}
  				work_h = card_h.substring(i, i+ 1);
				//花子の強さ
				while( true  ) {
					ncard_h ++;
					if(work_h.equals( alf[k] ))
						break;
					k ++;
				}
	  			
	  			if( ncard_t > ncard_h ) {
	  		  		//System.out.println("太郎勝ち");
	  				Judge = 1;
	  				break;
	  			}else if( ncard_t < ncard_h ) {
	  		  		//System.out.println("花子勝ち");
	  				Judge = 2;
	  				break;
	  			}
  			}
  			
  		}
  		
  		
  		//点の加点
  		switch ( Judge ){
  		case 0:
  			sum_t ++;
  			sum_h ++;
  			break;
  		case 1:
  			sum_t += 3;
  			break;
  		case 2:
  			sum_h += 3;
  			break;
  		}
  		
  		//終了判定
  		count ++;
  		if( count >= deck ) {
  			bJudge = false;
  		}
  		
  	}while( bJudge );
  	
  	  	//結果出力
  		System.out.println(sum_t + " " + sum_h);
	
  	//後処理
	scanner.close();
  }
}
