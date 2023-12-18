import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int[] array1 = new int[num1+1];
		 //配列1個目
		for(int i = 0; i < num1; i++) {
			array1[i] = scan.nextInt();
		}
		//配列2個目
		int num2 = scan.nextInt();
		int[] array2 = new int[num2];
		for(int i = 0; i < num2; i++) {
			array2[i] = scan.nextInt();
		}
		
		int count = 0; //2つの配列の共通の個数
		
		for(int i = 0; i < num2; i++) {
		count += linearSearch(num1, array1, array2[i]);
		}
		
		System.out.println(count);

}
	public static int linearSearch(int num1, int[] S, int x) {
		int i = 0;
		S[num1] = x;
		while(S[i] != x) {
			i++;
			if(i == num1) {
				return 0;
			}
		}
		return 1;
	}
}
