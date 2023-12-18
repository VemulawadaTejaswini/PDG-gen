import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	int saikou;
	int saitei;
	int kekka;

	public void hiki(){
		while(saikou!=999){
			System.out.println("最高気温を入力してください：");
			saikou = sc.nextInt();
			System.out.println("最低気温を入力してください：");
			saitei = sc.nextInt();
			kekka=saikou - saitei;
			System.out.println(kekka);
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Main main = new Main();
		main.hiki();
	}

}