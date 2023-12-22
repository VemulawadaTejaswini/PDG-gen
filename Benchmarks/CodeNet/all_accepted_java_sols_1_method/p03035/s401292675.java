import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		//入力表示
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if(A>=13) {
		System.out.println(B);
		}else if (A<=12 && A>=6){
			System.out.println(B/2);
		}else{
			System.out.println(0);
		}
	}
}