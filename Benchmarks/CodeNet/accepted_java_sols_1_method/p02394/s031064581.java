import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner in = new Scanner(System.in);

		int W = in.nextInt();
		int H = in.nextInt();
		int x = in.nextInt();
		int y = in.nextInt();
		int r = in.nextInt();

		if(x >= r && (x + r) <= W && y >= r && (y + r) <= H){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}

