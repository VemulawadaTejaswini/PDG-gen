import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int bit = 0;
		for(int i=0; i<N; i++) {
			bit |= scan.nextInt();
		}
		System.out.println(Integer.numberOfTrailingZeros(bit));
	}

}
