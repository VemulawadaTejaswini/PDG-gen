import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int l = sc.nextInt();
		int min = l;
		int max = l+n-1;
		int ans = 0;
		for(int i = 1; i <= n; i++){
			ans+=l+i-1;
		}
		if(max < 0){
			ans-=max;
		}else if(0 < min){
			ans-=min;
		}
		System.out.print(ans);
	}
}
