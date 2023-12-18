import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	Scanner sc = new Scanner(System.in);

	public void syori(){
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = a * 100 + b * 10 + c;

		switch(d){
		case 110:
			System.out.println("Open");
			break;
		case 1:
			System.out.println("Open");
			break;
		default:
			System.out.println("Close");

		}
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Main m = new Main();

		m.syori();
	}

}