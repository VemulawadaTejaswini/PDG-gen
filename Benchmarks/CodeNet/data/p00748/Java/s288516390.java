
import java.util.*;

import javax.naming.BinaryRefAddr;

import static java.lang.System.*;

class Main {
    public static Scanner sc = new Scanner(in);
    public static Random rand=new Random();



    public void run() {
    	List<Integer> pollock=new ArrayList<Integer>();

    	for(int i=1;i*(i+1)*(i+2)/6<1000000;i++){
    		pollock.add(i*(i+1)*(i+2)/6);
    	}

    	int[] dp=new int[100000],dp2=new int[100000];

    	for(int i=1;i<100000;i++){
    		int min=Integer.MAX_VALUE;
    		for(int j:pollock){
    			if(i-j>=0)min=Math.min(min,dp[i-j]+1);
    		}
    		dp[i]=min;
    	}

    	for(int i=1;i<100000;i++){
    		int min=Integer.MAX_VALUE;
    		for(int j:pollock){
    			if(i-j>=0 && j%2==1)
    				min=Math.min(min,dp2[i-j]+1);
    		}
    		dp2[i]=min;
    	}


    	while(true){
        	int n=sc.nextInt();
        	if(n==0)return;

        	ln(dp[n]+" "+dp2[n]);
        }
    }
    public static void main(String[] args) {
        new Main().run();
    }

    public int[] nextIntArray(int n){
        int[] res=new int[n];
        for(int i=0;i<n;i++){
            res[i]=sc.nextInt();
        }
        return res;
    }
    public static void pr(Object o) {
        out.print(o);
    }
    public static void ln(Object o) {
        out.println(o);
    }
    public static void ln() {
        out.println();
    }
}