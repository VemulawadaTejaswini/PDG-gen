import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] h = new int[n];
		int max = 0;
		int ans = 0;
		for(int i = 0; i < n; i++){
			h[i] = sc.nextInt();
			max = Math.max(h[i],max);
			if(h[i] >= max){
				ans++;
			}
		}
		System.out.print(ans);
	}
}
