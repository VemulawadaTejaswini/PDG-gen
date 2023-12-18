import java.util.*;
public class Main {

		public static int[] data;
		
	    public static void main(String[] args) throws java.io.IOException{
	        Scanner scan = new Scanner(System.in);
	        while(true){
	        int n=scan.nextInt();
	        if(n==0)break;
	        data = new int[n];
	        for(int i=0;i<n;i++)
	        	data[i]=scan.nextInt();
	        int tar = scan.nextInt();
	        System.out.println(binary_search(0,n,tar,1));
	        }
	    }
	        
	    public static int binary_search(int r,int l,int tar,int c){
	    	int pos =(r+l)/2;
	    	int res=0;
	    	if(pos==0 || pos == data.length-1 || data[pos] ==tar)return c;
	    	else if(data[pos] > tar)res = binary_search(pos,l,tar,c+1);
	    	else res = binary_search(r,pos,tar,c+1);
	    	return res;
	    }
}
	    