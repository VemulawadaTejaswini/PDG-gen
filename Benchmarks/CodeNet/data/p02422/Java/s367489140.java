import java.util.Scanner;

enum Order{
	print,
	reverse,
	replace
};


class Main {
  public static void main(String args[]) {
	Scanner scanner = new Scanner(System.in);
	String  inp = scanner.next();
  	String order;
  	Order  change;
  	int num = scanner.nextInt();
  	int count = 0;
  	
  	//change = Order.print;
  	change = null;
  	
  	while( scanner.hasNext() ){
  		order = scanner.next();

  		//命令判別
  		if( order.equals("print") ) {
  			change = Order.print;
  		}
  		if( order.equals("reverse") ) {
  			change = Order.reverse;
  		}
  		if( order.equals("replace") ) {
  			change = Order.replace;
  		}
  		
  		//命令ごとに処理
  		if( change != null ) {
	  		switch(change) {
	  		case print:
	  			print(inp);
	  			break;
	  		case reverse:
	  			inp = reverse(inp);
	  			break;
	  		case replace:
	  			inp = replace(inp);
	  		}
  		}
  		
  		count ++;
  		if(count > num) {
  			break;
  		}
  			
  	}
  	
	
  	//後処理
	scanner.close();
  }
  public static void print( String inpData ){
		Scanner scanner = new Scanner(System.in);
		int sta = scanner.nextInt();
		int end = scanner.nextInt();

  		String substr = inpData.substring(sta, end + 1);
		//出力
		System.out.println(substr);
		
		scanner.close();
  }
  public static String reverse( String inpData ){
		Scanner scanner = new Scanner(System.in);
		int sta = scanner.nextInt();
		int end = scanner.nextInt();
  		//入れ替え
  		String substr = inpData.substring(sta, end + 1);
		StringBuffer sb = new StringBuffer(substr);
  		String repstr = sb.reverse().toString();
		inpData = inpData.replaceFirst(substr, repstr);
		
		scanner.close();
		return inpData;
  }
  public static String replace( String inpData ){
		Scanner scanner = new Scanner(System.in);
		int sta = scanner.nextInt();
		int end = scanner.nextInt();
		String rep = scanner.next();
		//置換
  		String substr = inpData.substring(sta, end + 1);
		inpData = inpData.replaceFirst(substr, rep);

		scanner.close();
		return inpData;
  }
  
}


