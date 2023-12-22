import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main (String args[]) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	StringBuffer buf =new StringBuffer();
    	int m,f;

    	    int[]c = new int[3];

    	 while(true){
     	    int n = sc.nextInt();
     	    int x = sc.nextInt();
     	    int count = 0;
    	    if(n==0&&x==0){
    	        break;

    	    }else{
    	    	for(int a=1;a<=n;a++){
        	    	c[0]=a;
        	    	for(int b=1;b<=n;b++){
        	    		if(a<b){
        	    			c[1]=b;
        	    			for(int d=1;d<=n;d++){
        	    				if(b<d){
        	    					c[2]=d;
        	    					if(c[0]+c[1]+c[2]==x){
        	    						count +=1;
        	    					}
        	    				}
        	    			}
        	    		}
        	    	}
        	    }
    	    }
    	    System.out.println(count);
    	 }


}
}