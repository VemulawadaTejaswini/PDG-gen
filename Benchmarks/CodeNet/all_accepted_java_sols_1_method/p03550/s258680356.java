import java.util.*;

class Main{
    public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int z = sc.nextInt();
		int w = sc.nextInt();
		int xyturn = 1;
		int rtzw = 0;
		int[] ian = new int[n];
		for(int i=0;i<n;i++){
			ian[i] = sc.nextInt();
		}
		if(n==1){
			rtzw = ian[0] - w;
		}
		else{
			int ans1 = ian[n-2] - ian[n-1];
			if(ans1<0){
				ans1 *= -1;
			}
			int ans2 = ian[n-1] - w;
			if(ans2<0){
				ans2 *= -1;
			}
			rtzw= ans1>ans2 ? ans1 : ans2; 
		}
		if(rtzw<0){
			rtzw *= -1;
		}
		System.out.println(rtzw);
    }
}
