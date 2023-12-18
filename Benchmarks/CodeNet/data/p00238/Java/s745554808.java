import java.util.*;

public class Main {

	public static void main(String[] args) {
    	//declare
    	int target,times,start,end;
    	String   ret;
    	
    	//input
    	Scanner sc = new Scanner(System.in);
    	
    	while(true){
    		ret = "";
    		target = sc.nextInt();
    		if(target == 0){break;}
    		times  = sc.nextInt();
    		while(times-- > 0){
    			start = sc.nextInt();
    			end   = sc.nextInt();
    			target -= (end - start);
    		}
    		if   (target <= 0){ret = "OK";}
    		else              {ret = String.valueOf(target);}
    		System.out.println(ret);
    	}
	}
}