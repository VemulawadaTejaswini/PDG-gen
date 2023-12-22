//Volume2-0218
import java.util.*;

public class Main {

	public static void main(String[] args) {

		//declare
    	int    n,pm,pe,pj;
    	String ret;

    	//input
    	Scanner sc = new Scanner(System.in);
    	while(true){
    		n = sc.nextInt();
    		if(n == 0){break;}
    		while(n-- > 0){
    			pm = sc.nextInt();
    			pe = sc.nextInt();
    			pj = sc.nextInt();
    			
    			//calculate
    			if((pm == 100 || pe == 100 || pj == 100)||
 				  ((pm+pe)   /2 >= 90)||
 				  ((pm+pe+pj)/3 >= 80)){
    				ret = "A";
    			} else if(((pm+pe+pj)/3 >= 70) ||
    					 (((pm+pe+pj)/3 >= 50) &&
    					   (pm >= 80 || pe >= 80))){
    				ret = "B";
    			} else {
    				ret = "C";
    			}
    			
    			//output
    			System.out.println(ret);
    		}
    	}
	}
}