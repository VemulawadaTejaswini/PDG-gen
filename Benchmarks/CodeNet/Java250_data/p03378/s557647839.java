import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int x = scan.nextInt();
		List<Integer> a = new ArrayList<>();
		for(int i=0;i<m;i++) {
			a.add(scan.nextInt());
		}
//System.out.println(a);
		//xからnへ行くとき
		//int[]east =new int[n-x];
		int countEast = 0;
		for(int i=x;i<=n;i++) {
			if(a.contains(i)) {
				countEast++;
			}
		}
//System.out.println(countEast);
		int countWest = 0;
		for(int i=x;i>=0;i--) {
			if(a.contains(i)) {
				countWest++;
			}
		}
		//System.out.println(countWest);
		System.out.println(Math.min(countEast, countWest));
	}

}
