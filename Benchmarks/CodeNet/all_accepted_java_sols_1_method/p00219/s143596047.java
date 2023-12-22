//Volume2-0219
import java.util.*;

public class Main {

	public static void main(String[] args) {

		//declare
		final int      END  =  0,
		               KIND = 10;
		      int      n;
		      String[] cnt;

    	//input
    	Scanner sc = new Scanner(System.in);
    	while(true){
    		n = sc.nextInt();
    		if(n==END){break;}

    		//calculate
    		cnt = new String[KIND];
    		for(int i=0;i<10;i++){cnt[i] = "";}
    		while(n-- > 0){
    			cnt[sc.nextInt()] += "*";
    		}
    		//output
    		for(int i=0;i<KIND;i++){
    			System.out.println(cnt[i].equals("")?"-":cnt[i]);
    		}
    	}
	}
}