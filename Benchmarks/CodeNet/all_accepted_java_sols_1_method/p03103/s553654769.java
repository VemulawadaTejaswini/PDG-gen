import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] ab = new int[n][2];
		for(int i = 0; i < n; i++){
			ab[i][0] = sc.nextInt();
			ab[i][1] = sc.nextInt();
		}
		Arrays.sort(ab,(a,b) -> Integer.compare(a[0],b[0]));
		long ans = 0;
		int ans2 = 0;
		int i = 0;
		while(ans2 != m){
			for(int j = 0; j < ab[i][1] && ans2!=m; j++){
				ans+=ab[i][0];
				ans2++;
			}
			i++;
		}
		System.out.print(ans);
	}
}
