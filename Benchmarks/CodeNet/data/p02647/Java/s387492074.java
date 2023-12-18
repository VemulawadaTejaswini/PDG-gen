	import java.util.*;
	import java.util.Map.Entry;
	 
	 
	 class Main {
		 static int mod =  (int) (Math.pow(10,9)+7);
//		 static int mod =  (int) 998244353;
		 public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);

	        int N = sc.nextInt();
	        int K = sc.nextInt();
	        int[][] m = new int[1005][N+5];
	        for (int i=0 ; i<N; i++) {
	        	int tmp= Integer.parseInt(sc.next());
	            m[0][Math.max(0,i)]+=tmp;
	            m[0][Math.min(N,i+1)]-=tmp;
	        }
	        
    		int tmp=0;
	        for(int i=1;i<=Math.min(K, 1000);i++) {
	        	for(int j=0;j<N;j++) {
	        		if(j==0) {
	        			tmp=m[j][0];
	        		} else {
	        			tmp=tmp+m[i-1][j];
	        		}
		        	m[i][Math.max(0,j-tmp)]++;	        		
		        	m[i][Math.min(N,j+tmp)+1]--;	        		
	        	}
	        }
	        int[] ans = new int[N];
	        ans[0]=m[Math.min(K, 1000)][0];
	        System.out.print(ans[0]);
	        if(N!=1)System.out.print(" ");
	        for(int i=1;i<N;i++) {
	        	ans[i]=ans[i-1]+m[Math.min(K, 1000)][i];
	        	System.out.print(ans[i]);
	        	if(i==N-1) {
	        		System.out.println();
	        	} else {
	        		System.out.print(" ");
	        	}
	        }
	        
	       
	    }
	}