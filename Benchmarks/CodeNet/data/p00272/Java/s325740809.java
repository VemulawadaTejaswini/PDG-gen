import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	int t;
	int n;
	int kingaku;
	
	public void kei(){
		t = sc.nextInt();
		n = sc.nextInt();
		switch(t){
		case 1:kingaku = 6000 * n;
		       break;
		case 2:kingaku = 4000 * n;
		       break;
		case 3:kingaku = 3000 * n;
		       break;
		case 4:kingaku = 2000 * n;
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