import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numShop = sc.nextInt();
		int numDrink = sc.nextInt();
		long sell[][] = new long[numShop][2];//price,max
		for(int i = 0; i < numShop; i ++) {
			sell[i][0] = sc.nextLong();
			sell[i][1] = sc.nextLong();
		}
		Arrays.sort(sell, (a, b) -> Long.compare(a[0], b[0]));
		long cost = 0;
		long rest = numDrink;
		for(int i = 0; i < numShop; i ++) {
			if(rest >= sell[i][1]) {
				cost += sell[i][0] * sell[i][1];
				rest -= sell[i][1];
			}else {
				cost += sell[i][0] * rest;
				break;
			}
		}
		System.out.println(cost);
	}
}