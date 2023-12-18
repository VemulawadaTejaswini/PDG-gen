//Volume2-0219
import java.util.*;

public class Main {

	public static void main(String[] args) {

		//declare
		final int    END  =  0,
		             KIND = 10;
		      int    n;
		      int[]  cnt;
		      String ret;

    	//input
    	Scanner sc = new Scanner(System.in);
    	while(true){
    		n = sc.nextInt();
    		if(n==END){break;}

    		//calculate
    		cnt = new int[KIND];
    		while(n-- > 0){
    			cnt[sc.nextInt()]++;
    		}
    		//output
    		for(int i=0;i<KIND;i++){
    			ret = "";
    			if(cnt[i] == 0){
    				ret = "-";
    			} else {
    				for(int j=0;j<cnt[i];j++){
    					ret += "*";
    				}
    			}
    			System.out.println(ret);
    		}
    	}
	}
}