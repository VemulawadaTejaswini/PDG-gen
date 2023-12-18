	import java.util.*;
	import java.util.Map.Entry;
	 
	 
	 class Main {
		 static int mod =  (int) (Math.pow(10,9)+7);
//		 static int mod =  (int) 998244353;
		 static List<ArrayList<Integer>> list= new ArrayList<ArrayList<Integer>>();
		 public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);
	        int H = 1005;
	        int[] m = new int[H];
	        int[] p = new int[H];
	        int k=0;
		m[1]=1;
	        for(int i=2;i<H;i++) {
	        	if(m[i]==0) {
	        		m[i]=1;
	        		p[k]=i;
	        		k++;
	        		for(int j=i+i;j<H;j=j+i) {
	        			m[j]=i;
	        		}
	        	}
	        }	        

	        
	        int N = sc.nextInt();
	        int[][] dp = new int[100][100];
	        int[] m1 = new int[105];
	        dp[0][1]=1;
	        for(int i=1;i<=N;i++) {
	        	int t=i;
	        	while(t!=1) {
        			if(m[t]==1) {
    	        		for(int j=0;j<25;j++) {
    	        			if(t==p[j]) {
    	        				m1[j]++;
    	        			}
    	        		}        				
        				break;
        			} else {
    	        		for(int j=0;j<25;j++) {
    	        			if(m[t]==p[j]) {
    	        				m1[j]++;
    	        			}
    	        		}
    	        		t=t/m[t];        				
        			}
	        	}
	        }
	        dp[0][1]=1;
	        for(int i=0;i<=25;i++) {
	        	for(int j=1;j<=m1[i]+1;j++) {
	        		for(int l=0;l<80;l++) {
	        			if(l*j<80)dp[i+1][l*j]=dp[i+1][l*j]+dp[i][l];	   
	        		}     		
	        	}
	        	
	        }
	        System.out.println(dp[25][75]);
		 }
	}