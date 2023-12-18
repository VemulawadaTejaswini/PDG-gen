import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	Scanner sc = new Scanner(System.in);
	public void run() {
			int n = sc.nextInt();
			 calc(n);
	}
	public void calc(int n){
		int[] masu = new int[n];
		for(int i = 0; i < n; i++){
			masu[i] = sc.nextInt();
		}
		
		int[] memo = new int[n];
		Arrays.fill(memo, -1);
		memo[0] = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(0);
		
		int ans = -1;
		while(list.size() != 0){
			int nowMasu = list.get(0);
			list.remove(0);
			for(int m = 1; m < 7; m++){
				int nextMasu = nowMasu + m;
				if(nextMasu >= n-1){
					ans = memo[nowMasu] + 1;
					break;
				}
				if(memo[nextMasu] == -1){
					memo[nextMasu] = memo[nowMasu] + 1;
					if(masu[nextMasu] == 0) list.add(nextMasu);
					while(masu[nextMasu] != 0){
						nextMasu = nextMasu + masu[nextMasu];
						if(nextMasu >= n-1){
							ans = memo[nowMasu] + 1;
							break;
						}
						if(memo[nextMasu] == -1){
							memo[nextMasu] = memo[nowMasu] + 1;
							if(masu[nextMasu] == 0) list.add(nextMasu);
						}
						else break;
					}
				}
				if(ans != -1) break;
			}
			if(ans != -1) break;
		}
		System.out.println(ans);
	}

	
	public static void main(String[] args) {
		new Main().run();
	}
}