	import java.util.*;
	import java.util.Map.Entry;
	 
	 
	 class Main {
		 static int mod =  (int) (Math.pow(10,9)+7);
//		 static int mod =  (int) 998244353;
		 static List<ArrayList<Integer>> list= new ArrayList<ArrayList<Integer>>();
		 public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);
	        
	        int H = sc.nextInt();
	        int W = sc.nextInt();
	        int K = sc.nextInt();
	        char[][] m= new char[H][W];
	        for(int i=0;i<H;i++) {
	        	String S = sc.next();
	        	m[i]=S.toCharArray();
	        }
	        
	        
	        long ans=0;
	        int n = (int)Math.pow(2, H+W);
	        for(int i=0;i<n;i++) {
	        	int cnt=0;
	        	for(int j=0;j<H;j++) {
	        		for(int k =0;k<W;k++) {
	        			if(((i>>j)%2)==0&&((i>>(H+k))%2)==0) {
	        				if(m[j][k]=='#') {
	        					cnt++;
	        				}
	        				
	        			}
	        		}
	        	}
	        	if(cnt==K)ans++;
	        }
	        
	        System.out.println(ans);

		 }
	}