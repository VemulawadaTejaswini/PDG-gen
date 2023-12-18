import java.util.Scanner;


public class Main{
    public  static void main(String[] args) {
    	try (Scanner sc = new Scanner(System.in)) {
    		int[] dp=new int[20001];
    		int A=sc.nextInt();
    		int B=sc.nextInt();
    		int C=sc.nextInt();
    		int X=sc.nextInt();
    		for(int i=0; i<=A; i++) {
    			for(int j=0; j<=B; j++) {
    				for(int k=0; k<=C; k++) {
    					if(i*500+j*100+k*50<=X) {
    						dp[i*500+j*100+k*50]+=1;
    					}
    				}
    			}
    		}
    		System.out.println(dp[X]);
    	}
    }
}