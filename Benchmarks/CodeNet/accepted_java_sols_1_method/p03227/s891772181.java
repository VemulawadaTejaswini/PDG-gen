import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    String ip = sc.next();
	    
	    if (ip.length() == 2 ){
	        System.out.println(ip);
	    }
	    else if(ip.length() == 3){
	        StringBuilder ipr = new StringBuilder();
	        ipr.append(ip);
	        ipr = ipr.reverse();
	        System.out.println(ipr);
	    }else{
	        System.out.println();
	    }
	    
	}
}
