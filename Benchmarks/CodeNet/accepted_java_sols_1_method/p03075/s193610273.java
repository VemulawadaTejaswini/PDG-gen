import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int[] ant = new int[5];
 		ant[0] = sc.nextInt();
		ant[1] = sc.nextInt();
		ant[2] = sc.nextInt();
		ant[3] = sc.nextInt();
		ant[4] = sc.nextInt();
		int k = sc.nextInt();
		int cnt = 0;
		
		for(int l = 0; l < ant.length; l++) {
			for(int n = 0; n < ant.length; n++) {
				if(ant[l] > ant[n]) {
					if(ant[l] - ant[n] > k) {
						cnt++;
					}
				}
				else {
					if(ant[n] - ant[l] > k) {
						cnt++;
					}
				}
			}
		}
		// 出力
		if(cnt == 0) {
			System.out.println("Yay!");
		}
		else {
			System.out.println(":(");
		}
	}
}