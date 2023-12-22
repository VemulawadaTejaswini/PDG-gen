import java.util.Scanner;


public class  Main {

	static Scanner sc = new Scanner(System.in);
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		int n = sc.nextInt();
		int number[] = new int[n];
		for(int i=0; i < n; i++){
			number[i] = sc.nextInt();
		}
		
		//配列に入っている整数を配列の後ろから、空白を挟みながら出力する
		for(int i=n-1; i >0; i--){
			System.out.print(number[i] + " ");
		}
		System.out.println(number[0]);
		
	}

}