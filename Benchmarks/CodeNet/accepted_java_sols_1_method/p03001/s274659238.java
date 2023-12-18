import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//Input
		Scanner sc = new Scanner(System.in);
		int W = Integer.parseInt(sc.next());
		int H = Integer.parseInt(sc.next());
		int x = Integer.parseInt(sc.next());
		int y = Integer.parseInt(sc.next());
		sc.close();

		int count = 0;

		if(x + x == W && y + y == H) {
			count = 1;
		}

		double answer = ((double)W * (double)H) / 2;

		System.out.println(answer + " " + count);

	}

}
