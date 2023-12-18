import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	Scanner sc = new Scanner(System.in);
	int kin=0;

	public void syori(){
		int ku = sc.nextInt();
		int su = sc.nextInt();

		switch(ku){
		case 1:
			kin = 6000 * su;
			break;
		case 2:
			kin = 4000 * su;
			break;
		case 3:
			kin = 3000 * su;
			break;
		case 4:
			kin = 2000 * su;
			break;
		}

	}

	public void out(){
		System.out.println(kin);
	}


	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Main m = new Main();

		for(int r=0;r<4;r++){
			m.syori();
			m.out();
		}

	}
}