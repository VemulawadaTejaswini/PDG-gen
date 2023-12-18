import java.util.Scanner;
 
 
class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int  num = scanner.nextInt();//階層数
		
		System.out.println( fin(num) );
		 
		scanner.close();
	}
	 
	public static long fin(int num) {
		long Fin0 = 1,Fin1 = 1,Fin = 0;
		
		//この2つだけそのまま
		if( num == 0 ) return 0;
		if( num == 1 ) return 1;
		 
		//フィボナッチ数列
		for(int i = 1; i < num; i ++) {
			Fin = Fin0 + Fin1;
			Fin0 = Fin1;
			Fin1 = Fin;
		}
		 
		return Fin; 
	}
}
