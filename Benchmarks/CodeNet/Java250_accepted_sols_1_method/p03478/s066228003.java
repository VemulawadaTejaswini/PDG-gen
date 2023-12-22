
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int A = scan.nextInt();
		int B = scan.nextInt();
		int sum = 0;
		int tmp = 0;
		for(int i = 1; i <= N; i++) {
			for(int j = 0; j < Integer.toString(i).length(); j++) {
				tmp += Integer.parseInt(Integer.toString(i).substring(j, j + 1));
			}
			if(tmp >= A && tmp <= B) {
				sum += i;
			}
			tmp = 0;
		}
		System.out.println(sum);
		scan.close();
	}

}
