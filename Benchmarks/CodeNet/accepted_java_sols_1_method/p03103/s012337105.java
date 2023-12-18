import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] a = new int[n][2];
		for(int i = 0; i < n; i++){
			a[i][0] = sc.nextInt();
			a[i][1] = sc.nextInt();
		}
		Arrays.sort(a,(c,b) -> Integer.compare(c[0],b[0]));
		long ans = 0;
		int ansb = 0;
		int i = 0;
		while(ansb != m){
			if(a[i][1]+ansb >= m){
				ans += (long)a[i][0]*(m-ansb);
				ansb = m;
			}else{
				ansb += a[i][1];
				ans += (long)a[i][0]*a[i][1];
				i++;
			}
		}
		System.out.print(ans);
	}
}
