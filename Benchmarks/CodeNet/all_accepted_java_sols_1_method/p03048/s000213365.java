
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int R = Integer.parseInt(sc.next());//int型
		int G = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());
		int N = Integer.parseInt(sc.next());
		sc.close();
		int b = 0;
		int resi = 0;
		int ans = 0;
		for(int r = 0; r <= 3000; r++) {
			for(int g = 0; g <= 3000; g++) {
				resi = N - r*R - g*G; 
				if (resi%B==0 && resi >= 0) {
					ans++;
					// System.out.println(r+" "+g+" "+resi/B+" ");
				}
			}
		}
		System.out.println(ans);
	}

}
