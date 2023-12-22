import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
      
		//入力表示
		int A = sc.nextInt();
		int B = sc.nextInt();

		Boolean flag = false;
		
		for (int i = 1; i < 10000; i++) {
			if (Math.floor(i * 0.08) == A && Math.floor(i * 0.10) == B) {
				System.out.println(i);
				flag = true;
				break;
			}	
		}
	if (!flag) {
				System.out.println(-1);
			}
	}
}