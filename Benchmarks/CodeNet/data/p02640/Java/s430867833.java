import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int X = sc.nextInt();
		int Y = sc.nextInt();
		int s = 0;

		for(int i = 0;i<X;i++) {
			Y=Y%4;
			if(Y<4) {
				break;
			}
		}

		if(Y==2 || Y==0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
