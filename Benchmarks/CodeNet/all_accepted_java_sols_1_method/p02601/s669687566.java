import java.util.*;

public class Main{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int r=sc.nextInt();
	    int g=sc.nextInt();
	    int b=sc.nextInt();
	    int k=sc.nextInt();
	    
	    b*=(int)Math.pow(2, k);
	    for(int i=0;i<=k;i++) {
	    	if(r<g && g<b) {
	    		System.out.println("Yes");
	    		System.exit(0);
	    	}else {
	    		b/=2;
	    		g*=2;
	    	}
	    }
	    
	    System.out.println("No");

	    
	}
}
