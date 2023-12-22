import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int x = sc.nextInt();
	    ArrayList<Integer>ans  = new ArrayList<>();
	    
	    if(x==1) {
	    	System.out.println("1");
	    }else {
	    for(int i=1; i<=x; i++) {
	    	for(int j=2; j<=x; j++) {
	    		if((int)Math.pow(i, j)<=x) {
	    			ans.add((int)Math.pow(i, j));
	    		}
	    	}
	    }
	    Collections.sort(ans,Collections.reverseOrder());
	    	System.out.println(ans.get(0));
	      }
	}
}