import java.util.Arrays;
import java.util.Scanner;


public class Main {

	static Scanner sc = new Scanner(System.in);
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
			
		String str[] = sc.nextLine().split(" ");
		int number[] = new int[str.length];
		for(int i=0; i < str.length; i++){
			number[i] = Integer.parseInt(str[i]);
		}
		
		Arrays.sort(number);
		
		for(int i=0; i < number.length; i++){
			System.out.print(number[i]);
			
			if(i < number.length - 1){
				System.out.print(" ");
			}
		}
		System.out.println();
		
	}

}