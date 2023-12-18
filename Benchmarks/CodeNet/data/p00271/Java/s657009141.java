import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	int cnt;
	int[] kionsa = {1,2,3,4,5,6,7};
	
	public void keisan(){
		for (cnt=0;cnt<=6;cnt++){
			int saikou = sc.nextInt();
			int saitei = sc.nextInt();
			kionsa[cnt] = saikou-saitei;		
		}
	}
	
	public void hyouji(){
		for (cnt=0;cnt<=6;cnt++){
			System.out.println(kionsa[cnt]);
		}
	}
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Main yo = new Main();
		yo.keisan();
		yo.hyouji();
		
	}

}