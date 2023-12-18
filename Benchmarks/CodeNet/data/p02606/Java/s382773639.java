import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタ
		Scanner in = new Scanner(System.in);

		int l = in.nextInt();
		int r = in.nextInt();
		int d = in.nextInt();
		int count = 0;

		for(int i=l;i<=r;i++) {
			if(i%d==0) {
				count++;
			}
		}
		System.out.println(count);

	}

}
