import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scan = new Scanner(System.in);
		String[] str = scan.nextLine().split(" ");

		for(int i = 0; i < str.length; i++){
			System.out.print(str[i].toUpperCase().charAt(0));
		}
	}

}
