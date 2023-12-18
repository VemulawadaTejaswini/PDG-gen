import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	int t;
	int n;
	int tanka;
	int kingaku;
	
	public void kei(){
		t = sc.nextInt();
		n = sc.nextInt();
		switch(t){
		case 1:tanka = 6000;
		       kingaku = tanka * n;
		       break;
		case 2:tanka = 4000;
		       kingaku = tanka * n;
		       break;
		case 3:tanka = 3000;
		       kingaku = tanka * n;
		       break;
		case 4:tanka = 2000;
		       kingaku = tanka * n;
		       break;
		}
	}
	
	public void hyouji(){
		System.out.println(kingaku);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Main go = new Main();
		go.kei();
		go.hyouji();
	}

}