import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	int n;
	int[] onndosa = {1,2,3,4,5,6,7};
	public void nyuuryoku(){
			for(n = 0;n <= 6;n++){
				int saikou = sc.nextInt();
				int saitei = sc.nextInt();
				onndosa[n] = saikou - saitei;
		}
	}
	public void syuturyoku(){
		for(n = 0;n <= 6;n++){
			System.out.println(onndosa[n]);
		}
	}
		public static void main(String[] args) {
			Main toi = new Main();
			toi.nyuuryoku();
			toi.syuturyoku();
	}

}