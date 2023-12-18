import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner in = new Scanner(System.in);

		int[] num = new int[5];
		for(int i=0; i<num.length; i++) {
			num[i] = in.nextInt();
		}

		for(int i=0; i<num.length; i++) {
			if(num[i] != i+1) {
				System.out.println(i+1);
				break;
			}
		}
	}

}
