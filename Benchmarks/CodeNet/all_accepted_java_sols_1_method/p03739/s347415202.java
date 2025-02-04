import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner io = new Scanner(System.in);
		int n = io.nextInt();
		int[] a = new int[n+1];
		for(int i=1;i<=n;i++){
			a[i] = io.nextInt();
		}
	
		// + - 
		long sum = 0;
		long now=0;
		long border = 1;
		long end = 0;
		long ans_p=0;
	
		for(int i=1;i<=n;i++){
			sum += a[i];
			end = border-sum;
			if(border>0){
				if(now<end){
					ans_p += Math.abs(now-end);
					now = end;
				}
			}else{
				if(now>end){
					ans_p += Math.abs(now-end);
					now = end;
				}
			}
			border = -border;
		}
		
		//- +
		sum=0;
		now=0;
		border = -1;
		end = 0;
		long ans_m=0;
		
		for(int i=1;i<=n;i++){
			sum += a[i];
			end = border-sum;
			if(border>0){
				if(now<end){
					ans_m += Math.abs(now-end);
					now = end;
				}
			}else{
				if(now>end){
					ans_m += Math.abs(now-end);
					now = end;
				}
			}
			border = -border;
		}
		System.out.println(Math.min(ans_p,ans_m));
	}
}