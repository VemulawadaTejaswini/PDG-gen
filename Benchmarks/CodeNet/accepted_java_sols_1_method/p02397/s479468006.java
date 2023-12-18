import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int t = 0;
			if(x == 0 && y == 0) {
				break;
			}
			if(x > y) {
				t = x;
				x = y;
				y = t;
			}
			System.out.printf("%d ",x);
			System.out.printf("%d\n",y);
		}

	}
}
