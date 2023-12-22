
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int T_tairyoku = sc.nextInt();
		int T_Attack = sc.nextInt();
		int A_tairyoku = sc.nextInt();
		int A_Attack = sc.nextInt();
		sc.close();


		while(true) {
			//青木に攻撃
			A_tairyoku -= T_Attack;
			if(A_tairyoku <= 0) {
				System.out.println("Yes");
				break;
			}
			T_tairyoku -= A_Attack;
			if(T_tairyoku <= 0) {
				System.out.println("No");
				break;
			}
		}
	}

}
