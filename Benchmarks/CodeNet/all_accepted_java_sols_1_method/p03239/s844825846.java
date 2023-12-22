import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int maxTime =  sc.nextInt();
		int minCost = 10000;
		for(int i = 0; i < num; i ++) {
			int crtCost = sc.nextInt();
			if(sc.nextInt() <= maxTime) {
				minCost = Math.min(minCost, crtCost);
			}
		}
		System.out.println(minCost == 10000 ? "TLE" : minCost);
	}
}