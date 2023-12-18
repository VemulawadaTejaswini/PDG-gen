package a2;
import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int kin = 0;
		int a,b;
		for(int i=0;i<4;i++){
			a = sc.nextInt();
			b = sc.nextInt();
			//kin = 0;

			switch (a) {
			case 1:
				kin =6000*b;
				break;
			case 2:
				kin =4000*b;
				break;
			case 3:
				kin =3000*b;
				break;
			case 4:
				kin =2000*b;
				break;
			}
			System.out.print(kin);
		}
	}

}