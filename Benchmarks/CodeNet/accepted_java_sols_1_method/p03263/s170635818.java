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
	        int[][] c = new int[H][W];
	        for(int i=0;i<H;i++) {
	        	for(int j=0;j<W;j++) {
	        		c[i][j]=sc.nextInt();
	        	}
	        }
	        StringBuffer ans = new StringBuffer();
	        int cnt=0;
	        for(int i=0;i<H;i++) {
	        	for(int j=0;j<W;j++) {
	        		if(c[i][j]%2==1) {
	        			if(j==W-1) {
	        				if(i!=H-1) {
	        					c[i+1][j]++;
	        					ans.append(i+1);
	        					ans.append(" ");
	        					ans.append(j+1);
	        					ans.append(" ");
	        					ans.append(i+2);
	        					ans.append(" ");
	        					ans.append(j+1);
	        					ans.append("\n");
	        					cnt++;
	        				}
	        			} else {
        					c[i][j+1]++;
        					ans.append(i+1);
        					ans.append(" ");
        					ans.append(j+1);
        					ans.append(" ");
        					ans.append(i+1);
        					ans.append(" ");
        					ans.append(j+2);
        					ans.append("\n");
        					cnt++;
	        			}
	        		}
	        	}
	        }
	        System.out.println(cnt);	        
	        System.out.print(ans);
		 }

	}