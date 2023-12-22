import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner seer = new Scanner(System.in);
		int n = seer.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++){
			arr[i] = seer.nextInt();
		}
		int mincost = Integer.MAX_VALUE;
		for(int val = -100; val <= 100; val++){
			int cost = 0;
			for(int k: arr){
				cost += (k - val)*(k - val);
			}
			mincost = Integer.min(mincost, cost);
		}
		System.out.println(mincost);
	}

}
