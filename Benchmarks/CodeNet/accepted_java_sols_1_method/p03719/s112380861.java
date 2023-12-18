import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		String[] str = scan.nextLine().split(" ");
		if(Integer.parseInt(str[2]) >= Integer.parseInt(str[0]) && Integer.parseInt(str[2]) <= Integer.parseInt(str[1])){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}
