import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		//入力表示
		int A = sc.nextInt();
		int P = sc.nextInt();
		
		int applepiece =A*3;
		int total=applepiece+P; 
		int pai =total/2;
		 
		if(total>=1) {
		System.out.println(pai);
		}else {
			System.out.println(0);
		}
	}
}
