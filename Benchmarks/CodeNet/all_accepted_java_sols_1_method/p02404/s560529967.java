import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		while (true) {
        // 入力されるH,Wを定義

        int H = scanner.nextInt();
        int W = scanner.nextInt();

        // H,Wともに0の時終了
        if (H == 0 && W == 0) {
        	break;
        }

        for (int i = 0; i < H; i++) {
        	for (int j = 0; j < W; j++) {
        		if (i == 0 || i == H - 1 || j == 0 || j == W - 1) {
        		System.out.print("#");
        		} else {
        			System.out.print(".");
        		}
        	}
        	System.out.println("");
        }
        System.out.println("");
		}
	}

}
