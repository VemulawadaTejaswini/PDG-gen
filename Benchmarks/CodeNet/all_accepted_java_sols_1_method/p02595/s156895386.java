import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		long d = sc.nextInt();
		int cnt=0;
		boolean flgSame = false;
		
		ArrayList<Integer> arrX = new ArrayList<>();
		ArrayList<Integer> arrY = new ArrayList<>();
		
		for(int i=0;i<n;i++) {
			long x = sc.nextInt();
			long y = sc.nextInt();
			if(d*d >=x*x + y*y) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}