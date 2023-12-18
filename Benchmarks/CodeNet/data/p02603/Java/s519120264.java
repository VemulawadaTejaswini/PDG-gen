import java.util.Scanner;

public class Main {
	private static Scanner sc;
	
	public static void main(String[] args) {
		sc =  new Scanner(System.in);
		//money:お金
		int money = 1000;
		//stock:株
		int stock = 0;
		//N:期間
		int n = Integer.parseInt(sc.next());
		//各日の株予想
		int[] longArr = new int[n];
		for (int i=0; i<n; i++) {
			longArr[i] = Integer.parseInt(sc.next());
		}
		
		for (int i=0; i<n-1; i++) {
			//case : 株を買う->底値の時
			if(longArr[i] < longArr[i+1] ) {
				stock = money / longArr[i];
				money += (longArr[i+1] - longArr[i])*stock;
			}
		}
		System.out.println(money);
	}
}
