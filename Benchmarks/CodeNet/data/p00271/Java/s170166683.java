import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	int a;
	int b;
	int kekka;

	public void hiki(){
		while(a!=999){
			System.out.println("最高気温を入力してください：");
			a = sc.nextInt();
			System.out.println("最低気温を入力してください：");
			b = sc.nextInt();
			kekka=a - b;
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