import java.util.Scanner;


public class Main {

	static Scanner sc = new Scanner(System.in);
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a > b){
			System.out.println("a > b");
		}
		else if(a < b){
			System.out.println("a < b");
		}
		else{
			System.out.println("a == b");
		}
		
	}

}