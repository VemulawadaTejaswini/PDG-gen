import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//Input
		Scanner sc = new Scanner(System.in);
		int X = Integer.parseInt(sc.next());
		int A = Integer.parseInt(sc.next());
		sc.close();

		//logic
		if(X < A) {
			System.out.println(0);
		}else {
			System.out.println(10);
		}
		
	}

}
