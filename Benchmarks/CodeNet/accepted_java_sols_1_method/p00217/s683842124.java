//Volume2-0217
import java.util.*;

public class Main {

	public static void main(String[] args) {

		//declare
    	int    n,p,d,
    	       max_p = -1,
    	       max   = -1;

    	//input
    	Scanner sc = new Scanner(System.in);
    	while(true){
    		n = sc.nextInt();
    		if(n == 0){break;}
    		
    		//calculate
   			max = 0;
    		while(n-- > 0){
    			p = sc.nextInt();
    			d = sc.nextInt() + sc.nextInt();
    			if(max < d){
    				max_p = p;
    				max = d;
    			}
    		}
    		//output
    		System.out.println(max_p + " " + max);
    	}
	}
}