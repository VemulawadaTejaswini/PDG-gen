import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();	//要素数
		
		gcd_profits(num, scanner);
		
		scanner.close();
	}
	
	public static void gcd_profits(int num , Scanner scanner) {
		int sub;
		int work;
		int min;
		int max;
		int count = 0;
		int profits = 0;
		int cur;
		int oldcur;

		min = (int)Math.pow(10, 9);
		oldcur = (int)Math.pow(10, 9);
		
		  while (count < num) {
		  	cur = scanner.nextInt();	//価格
		  	
		  	//差分を出していく
		  	sub = cur - min;
		  	
		  	//最小か最大か調べる
		  	if( sub > profits ){
		  		profits = sub;
		  	}else if( cur < min ){
		  			min = cur;
		  	}
		  	
		  	oldcur = cur;
		  	
		  	count ++;
		  }
		  System.out.println(profits);
		}
}


