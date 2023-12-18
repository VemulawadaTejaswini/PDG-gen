import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] x = new int[n];
		for(int i = 0; i < n; i++){
			x[i] = sc.nextInt();
		}
		int ans = 1000000000;
		for(int i = 0; i+k-1 < n; i++){
			int work;
			if(x[i] < 0 && x[i+k-1] > 0){
				work = Math.min(Math.abs(x[i]),Math.abs(x[i+k-1]))*2+Math.max(Math.abs(x[i]),Math.abs(x[i+k-1]));
			}else{
				work = Math.max(Math.abs(x[i]),Math.abs(x[i+k-1]));
			}
			ans = Math.min(ans,work);
		}
		System.out.print(ans);
	}
}
