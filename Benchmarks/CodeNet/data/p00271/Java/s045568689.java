import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int[] sa = new int[7];
		for(int i=0;i<7;i++){
		int a = sc.nextInt();
		int b = sc.nextInt();
		 sa[i] = a-b;
		}
		for(int i = 0;i<7;i++){
			System.out.println(sa[i]);
		}
	}

}