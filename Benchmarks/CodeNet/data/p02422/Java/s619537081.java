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
  	boolean Judge = true;
  	
  	//change = Order.print;
  	change = null;
  	
  	while( Judge ){
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
	  			print(inp,scanner);
	  			break;
	  		case reverse:
	  			inp = reverse(inp,scanner);
	  			break;
	  		case replace:
	  			inp = replace(inp,scanner);
	  		}
  		}
  		
  		count ++;
  		if(count >= num) {
  			Judge = false;
  			break;
  		}
  			
  	}
  	
	
  	//後処理
	scanner.close();
  }
  public static void print( String inpData ,Scanner scanner){
		int sta = scanner.nextInt();
		int end = scanner.nextInt();

  		String substr = inpData.substring(sta, end + 1);
		//出力
		System.out.println(substr);
  }
  
  public static String reverse( String inpData ,Scanner scanner){
		int sta = scanner.nextInt();
		int end = scanner.nextInt();
  		//入れ替え
  		String substr = inpData.substring(sta, end + 1);
		StringBuffer sb = new StringBuffer(substr);
  		String repstr = sb.reverse().toString();
		inpData = inpData.replaceFirst(substr, repstr);
		
		return inpData;
  }
  
  public static String replace( String inpData , Scanner scanner){
		int sta = scanner.nextInt();
		int end = scanner.nextInt();
		String rep = scanner.next();
		//置換
  		String substr = inpData.substring(sta, end + 1);
		inpData = inpData.replaceFirst(substr, rep);

		return inpData;
  }
  
}


