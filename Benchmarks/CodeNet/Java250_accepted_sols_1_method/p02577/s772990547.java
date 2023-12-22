import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		String N = scan.next();
		scan.close();
		String[] strarray = N.split("");


		int[] num = new int[strarray.length];
		int sum = 0;
		for(int i = 0; i < strarray.length; i++) {

			num[i] = Integer.parseInt(strarray[i]);
			sum = sum + num[i];

		}

		if(sum % 9 == 0) {
			System.out.println("Yes");
		}else if(sum % 9 != 0) {
			System.out.println("No");
		}

	}

}
