import java.util.*;
public class Main {
		public static char [] ns = new char [8];
		public static char[] perm =new char[8];
		public static boolean[] used =new boolean[8];
		public static  int max,min;
		
	    public static void main(String[] args) throws java.io.IOException{
	        Scanner scan = new Scanner(System.in);
	        int n=scan.nextInt();
	        scan.nextLine();
	        for(int i=0;i<n;i++){
	        ns = scan.nextLine().toCharArray();
	        max=0;
	        min=99999999;
	        permutation(0,8);
	        System.out.println(max-min);
	        }
	        
	    }
	    public static void permutation(int pos,int n){
	    	if(pos==n){
	    		StringBuilder sb =new StringBuilder();
	    		for(int i=0;i<n;i++){
	    			sb.append(perm[i]);
	    		}
	    		max=Math.max(max,Integer.parseInt(sb.toString()));
	    		min=Math.min(min,Integer.parseInt(sb.toString()));
	    		return ;
	    		
	    	}
	    	
	    	for(int i=0;i<n;i++){
	    		if(!used[i]){
	    			perm[pos] = ns[i];
	    			used[i]=true;
	    			permutation(pos+1,n);
	    			used[i]=false;
	    		}
	    	}
	    	return ;
	    }
}
	    