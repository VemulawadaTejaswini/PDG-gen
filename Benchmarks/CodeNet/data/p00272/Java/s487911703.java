import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	int cnt;
	int seki;
	int kingaku;
	int maisuu;
	int[] uriage = new int [4];
	
	public void syurui(){
		for (cnt=0;cnt<=3;cnt++){
			seki = sc.nextInt();
			maisuu = sc.nextInt();
			switch(seki) {
			case 1: kingaku=6000;  break;
			case 2: kingaku=4000;  break;
			case 3: kingaku=3000;  break;
			case 4: kingaku=2000;  break;
			}
			uriage[cnt] = kingaku*maisuu;			
		}
	}
	
	public void keisan(){
		for (cnt=0;cnt<=3;cnt++){
			System.out.println(uriage[cnt]);
		}
	}
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Main yo = new Main();
		yo.syurui();
		yo.keisan();
		
	}

}