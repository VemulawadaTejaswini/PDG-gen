
import java.util.*;

class Main {
    Scanner sc = new Scanner(System.in);
    public void run(){
    	int size=sc.nextInt();
        while(size--!=0){
        	int n=sc.nextInt();
        	String str=sc.next();
        	int[] dp=new int[3],tmp=new int[3];
        	if(str.charAt(2*n)=='Y'){
        		dp[0]=3;
        		dp[1]=2;
        		dp[2]=2;
        	}else if(str.charAt(0)=='Y'){
        		dp[0]=1;
        		dp[1]=1;
        		dp[2]=2;
        	}else{
        		dp[0]=0;
        		dp[1]=1;
        		dp[2]=2;
        	}
        	for(int i=1;i<2*n-1;i+=2){
        		boolean top=str.charAt(i)=='Y' || str.charAt(i+1)=='Y';
        		boolean bottom=str.charAt(2*n+i)=='Y' || str.charAt(2*n+i+1)=='Y';
        		if(top && bottom){
        			tmp[0]=Math.min(dp[0]+3,Math.min(dp[1]+2,dp[2]+2));
        			tmp[1]=Math.min(dp[0]+2,Math.min(dp[1]+2,dp[2]+2));
        			tmp[2]=Math.min(dp[0]+2,Math.min(dp[1]+2,dp[2]+3));
        		}else if(!top && bottom){
        			tmp[0]=Math.min(dp[0]+3,Math.min(dp[1]+2,dp[2]+2));
        			tmp[1]=Math.min(dp[0]+2,Math.min(dp[1]+1,dp[2]+1));
        			tmp[2]=Math.min(dp[0]+2,Math.min(dp[1]+1,dp[2]+2));
        		}else if(top && !bottom){
        			tmp[0]=Math.min(dp[0]+2,Math.min(dp[1]+1,dp[2]+2));
        			tmp[1]=Math.min(dp[0]+1,Math.min(dp[1]+1,dp[2]+2));
        			tmp[2]=Math.min(dp[0]+2,Math.min(dp[1]+2,dp[2]+3));
        		}
        		dp[0]=tmp[0];
        		dp[1]=tmp[1];
        		dp[2]=tmp[2];
        	}
        	boolean top=str.charAt(2*n-1)=='Y';
    		boolean bottom=str.charAt(4*n-1)=='Y';

    		int res=0;
        	if(top && bottom){
        		res=Math.min(dp[0]+3,
        		Math.min(dp[1]+2,
        		dp[2]+2));
        	}else if(top &&!bottom){
        		res=Math.min(dp[0]+1,
        		Math.min(dp[1]+1,
        		dp[2]+2));
        	}else if(!top &&bottom){
        		res=Math.min(dp[0]+3,
        		Math.min(dp[1]+2,
        		dp[2]+2));
        	}else{
        		res=Math.min(dp[0]+0,
        		Math.min(dp[1]+1,
        		dp[2]+2));
        	}
        	ln(res+n);
        }
    }
    public static void main(String[] args) {
        new Main().run();
    }
    public static void pr(Object o) {
        System.out.print(o);
    }
    public static void ln(Object o) {
        System.out.println(o);
    }
    public static void ln() {
        System.out.println();
    }
}