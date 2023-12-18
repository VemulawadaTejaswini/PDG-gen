import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        long[] dp= new long[100010];//dp[距離]=数字
        long a;
        int n=sc.nextInt();
        int m=0;
        for(int i=1; i<=n; i++) {
            a=sc.nextInt();
            if(i==1) {
            	dp[0]=a;
            }
            else {
            	if(dp[m]<a) {
            		m++;
            		dp[m]=a;
            	}
            	else {
            		for(int k=0; k<=m; k++) {
            			if(dp[k]>=a) {
            				dp[k]=a;
            				break;
            			}
            		}
            	}
            }
        }
        System.out.println(m+1);
	}
}
