import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scan = new Scanner(System.in);

		int s = scan.nextInt();
		int w = scan.nextInt();

		if(w >= s){
			System.out.println("unsafe");
		}
	else {
		System.out.println("safe");
	}
}
}
