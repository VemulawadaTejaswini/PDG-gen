import java.util.*;
public class Main {
public static void main(String[] args)throws java.io.IOException{
	        Scanner scan = new Scanner(System.in);
	       
	        int n=scan.nextInt();
	        for(int i=1;i<=n;i++){
	        	System.out.println("Case "+i+":");
	        	msm(scan.nextInt(),1);
	        }
	    }
	    public static void msm(int n,int c){
	    	if(c==11)return ;
	    	String str =Integer.toString(n*n);
	    	StringBuilder sb=new StringBuilder();
	    	for(int i=0;i<8-str.length();i++)
	    		sb.append(0);
	    	sb.append(str);
	    	str = sb.toString().substring(2,6);
	    	int out =Integer.parseInt(str);
	    	
	    	System.out.println(out);
	    	msm(out,c+1);
	    	return ;
	    }
	     
}
	    