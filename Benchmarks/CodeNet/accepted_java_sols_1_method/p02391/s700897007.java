import java.util.Scanner;
public class Main {

	static Scanner scan = new Scanner(System.in);
	/**
	 * 大小関係を判定するプログラム
	 * @param args　入力a,b
	 */
	public static void main(String[] args){
		int a,b;
//		a = Integer.parseInt(args[0]);
//		b = Integer.parseInt(args[1]);
		a = scan.nextInt();
		b = scan.nextInt();
		
		if(a < b){
			System.out.println("a < b");
		}else if(a > b){
			System.out.println("a > b");
		}else if(a == b){
			System.out.println("a == b");
		}
	}

}

