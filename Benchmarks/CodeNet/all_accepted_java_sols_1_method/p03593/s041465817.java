	import java.util.*;
	import java.util.Map.Entry;
	 
	 
	 class Main {
		 static int mod =  (int) (Math.pow(10,9)+7);
//		 static int mod =  (int) 998244353;
		 public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);

	        int H = sc.nextInt();
	        int W = sc.nextInt();
	        int[] m = new int[26];
	        for(int i=0;i<H;i++) {
	        	String S =sc.next();
	        	char[] c=S.toCharArray();
	        	for(int j=0;j<W;j++) {
	        		m[c[j]-'a']++;
	        	}
	        }
	        int f1=0;
	        int f2=0;
	        if(H%2==1&&W%2==1) {
	        	f1=H/2+W/2;
	        	f2=1;
	        } else if(H%2==1) {
	        	f1=W/2;
	        } else if(W%2==1) {
	        	f1=H/2;
	        }
	        for(int i=0;i<26;i++) {
	        	if(m[i]%2==1) {
	        		f2--;
	        	}
	        	if(m[i]%4==2) {
	        		f1--;
	        	}
	        }
	        String ans="Yes";
	        if(f1<0||f2<0) {
	        	ans="No";
	        }
	        
	        System.out.println(ans);
	       
	    }

	}