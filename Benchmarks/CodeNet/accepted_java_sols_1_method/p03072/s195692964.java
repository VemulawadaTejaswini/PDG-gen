import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] h = new int[n];
		int ans = 1;
		int max = 0;
		for(int i = 0; i < n; i++){
			h[i] = sc.nextInt();
			if(i != 0){
				if(h[i] >= max){
					ans++;
				}
			}
			max = Math.max(max,h[i]);
		}
		System.out.print(ans);
	}
}
