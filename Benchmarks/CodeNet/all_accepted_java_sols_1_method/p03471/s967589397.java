import java.util.Scanner;


public class Main{
    public  static void main(String[] args) {
    	try (Scanner sc = new Scanner(System.in)) {
    		int N=sc.nextInt();
    		int Y=sc.nextInt();
    		int[] dp= new int[20000001];
    		int a=0, b=0, c=0;
    		for(int i=0; i<=N; i++) {
    			for(int j=0; j<=N-i; j++) {
    				if(N-i-j>=0) {
    				if(i*10000+j*5000+(N-i-j)*1000==Y) {
    					a=i;
    					b=j;
    					c=N-i-j;
    					dp[Y]++;
    					break;
    				}
    				}
    			}
    		}
    		if(dp[Y]!=0) {
    			System.out.println(a+" "+b+" "+c);
    		}
    		else {
    			System.out.println(-1+" "+-1+" "+-1);
    		}
    	}
    }
}