import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	Scanner sc = new Scanner(System.in);

	public void syori(){
		int ue = sc.nextInt();
		int si = sc.nextInt();
		System.out.println(ue-si);
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Main m = new Main();
		for(int i=0;i<7;i++){
			m.syori();
		}
	}

}