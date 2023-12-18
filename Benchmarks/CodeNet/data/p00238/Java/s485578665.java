import java.util.*;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method astub
	    while(true){
	    	int stime = 0; 
	    	Scanner sc = new Scanner(System.in);
	    	int t = sc.nextInt();
	    	if(t==0) break;
	    	int n = sc.nextInt();
	    	for (int i=0;i<n;i++){
	    		int time_s = sc.nextInt();
	    		int time_f = sc.nextInt();
	    		stime += time_f - time_s;
	    	}
	    if(stime >= t) System.out.println("OK"); 
	    else System.out.println(t-stime);
	    }
	}
}