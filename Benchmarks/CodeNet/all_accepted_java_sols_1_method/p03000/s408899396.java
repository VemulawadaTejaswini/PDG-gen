import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int[] l = new int[n];
		for(int i = 0; i < n; i++){
			l[i] = sc.nextInt();
		}
		int ans = 1;
		int sum = 0;
		int i = 0;
		for(i = 0; sum <= x && i < n; i++){
			ans++;
			sum=sum+l[i];
		}
		if(sum > x){
			ans--;
		}
		System.out.print(ans);
	}
}
