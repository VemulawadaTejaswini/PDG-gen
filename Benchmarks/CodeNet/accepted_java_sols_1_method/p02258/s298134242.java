import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int tmpMin = Integer.MAX_VALUE;
		int maxProfit = Integer.MIN_VALUE;
		
		int r1 = Integer.parseInt(sc.next());
		tmpMin = Math.min(tmpMin, r1);
		
		for(int i=1; i<n; i++) {
			int r = Integer.parseInt(sc.next());
			maxProfit = Math.max(maxProfit, r-tmpMin);
			tmpMin = Math.min(tmpMin, r);
		}
		System.out.println(maxProfit);
    }
}
