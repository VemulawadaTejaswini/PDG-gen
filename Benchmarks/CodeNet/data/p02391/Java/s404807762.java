import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner in = new Scanner(System.in);

		int a = in.nextInt();
		int b = in.nextInt();
		String ans;

		if(a == b){
			ans = "a == b";
		}else if(a < b){
			ans = "a < b";
		}else{
			ans = "a > b";
		}
		System.out.println(ans);
	}
}

