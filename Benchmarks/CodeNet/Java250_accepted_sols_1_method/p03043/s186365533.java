import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		ArrayList<Double> ary = new ArrayList<>();
		int i = 0;
		while (true){
			double num = k / Math.pow(2, i);
			if(num < 1){
				break;
			}
			ary.add(num);
			i++;
		}
		int[] coinNums = new int[n];
		int coinNum = ary.size();
		loop:
		for(int m = 1; m <= n; m++){
			while(ary.get(coinNum - 1) <= m ){
				coinNum--;
				if (coinNum == 0){
					break loop;
				}
			}
			coinNums[m - 1] = coinNum;
		}
		double ans = 0;
		for(int cn : coinNums){
			ans += 1 / (double)n / Math.pow(2, cn);
		}
		System.out.println(ans);
	}
}
