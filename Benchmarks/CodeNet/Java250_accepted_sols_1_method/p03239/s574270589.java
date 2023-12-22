import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = sc.nextInt();
		int[] cost = new int[n];
		int[] time = new int[n];
		for(int i=0; i<n; i++) {
			cost[i] = sc.nextInt();
			time[i] = sc.nextInt();
		}
		int ans=0;
		for(int i=0; i<n; i++) {
			if(time[i]<=t && cost[ans]>cost[i]) {
				ans=i;
			}
		}
		if(time[ans]<=t) {
			System.out.println(cost[ans]);
		}else {
			System.out.println("TLE");
		}
	}
}