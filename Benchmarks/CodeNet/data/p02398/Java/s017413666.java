import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		boolean hantei = false;
		int x = 0;
		int y = 0;
		while (hantei != true ) {
			Scanner scan = new Scanner(System.in);
			x = scan.nextInt();//配列に数値を代入
			y = scan.nextInt();//次の配列に数値を代入y
			if (x == 0 && y ==0) {
				hantei = true;
			}else{
				if (x > y) {
					System.out.println(y+" "+x);
				}else {
					System.out.println(x+" "+y);
				}
			}
			}//if end
	}
}
