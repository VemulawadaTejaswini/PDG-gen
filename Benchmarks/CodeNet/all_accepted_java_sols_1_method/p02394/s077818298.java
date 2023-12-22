import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//入力された内容を変数に格納
		int W = sc.nextInt();
		int H = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int r = sc.nextInt();

		//円が長方形を出ないときの条件
		if(x >= r && y >= r &&
				x + r <= W && y + r <= H){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}
