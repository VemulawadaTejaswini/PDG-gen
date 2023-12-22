import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int w = sc.nextInt();
		int[] DP = new int[w+1];
		for(int i = 0; i < n; i++){
			int vv = sc.nextInt();
			int ww = sc.nextInt();
			for(int j = w; j >= 0; j--){
				if(j-ww>=0){
					DP[j] = Math.max(DP[j],DP[j-ww]+vv);
				}
			}
		}
		System.out.println(DP[w]);
	}
}

