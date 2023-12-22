import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int aPrice = sc.nextInt();
		int bPrice = sc.nextInt();
		int abPrice = sc.nextInt();
		int aPizzaCnt = sc.nextInt();
		int bPizzaCnt = sc.nextInt();
		sc.close();
		int abPizzaCnt = (aPizzaCnt > bPizzaCnt)? aPizzaCnt*2:bPizzaCnt*2;
		int defaultPrice = (aPrice*aPizzaCnt) + (bPrice*bPizzaCnt);
		int gattaiPrice = abPizzaCnt * abPrice;
		int sabunPrice = (((aPizzaCnt > bPizzaCnt)? bPizzaCnt*2:aPizzaCnt*2) * abPrice)
				+ ((aPizzaCnt > bPizzaCnt)? (aPizzaCnt-bPizzaCnt)*aPrice:
					(bPizzaCnt-aPizzaCnt)*bPrice);
		if(gattaiPrice > sabunPrice) gattaiPrice = sabunPrice;
		System.out.println((defaultPrice > gattaiPrice)?gattaiPrice:defaultPrice);
	}
}