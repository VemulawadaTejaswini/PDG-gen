import java.util.Scanner;
import java.util.Arrays;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int[] dp;
		while(scan.hasNext()){
			int n = scan.nextInt();
			if(n == 0){
				break;
			}
			int[] a = new int[n];
			for(int i = 0;i < n;i++){
				a[i] = scan.nextInt();
			}
			dp = new int[n];
			dp[0] = a[0];
			for(int i = 0;i < n;i++){
				for(int j = 0;j < i;j++){
					dp[i] = maximum(a[i],a[i]+dp[j]);
				}
			}
			Arrays.sort(dp);
			System.out.println(dp[dp.length-1]);
		}
	}
	public static int maximum(int a,int b){
		return (a > b)?a:b;
	}
}