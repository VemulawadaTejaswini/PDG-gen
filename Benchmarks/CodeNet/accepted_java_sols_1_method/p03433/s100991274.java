import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdin = new Scanner(System.in);
		if(stdin.nextInt()%500-stdin.nextInt()<=0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");

		}


	}

}
