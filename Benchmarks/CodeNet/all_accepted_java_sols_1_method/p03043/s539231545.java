import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		double ans = 0;
		for(int i = 1; i <= n; i++){
			int tmp = i;
			int cou = 0;
			while(tmp < k){
				tmp = tmp*2;
				cou++;
			}
			ans += (double)1/n*Math.pow(0.5,cou);
		}
		System.out.print(ans);
	}
}
