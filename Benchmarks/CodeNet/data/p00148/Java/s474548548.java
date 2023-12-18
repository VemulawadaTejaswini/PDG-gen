import java.util.*;
public class Main {

	    public static void main(String[] args) throws java.io.IOException{
	        Scanner scan = new Scanner(System.in);
	        while(scan.hasNext()){
	        	
	        	int n=scan.nextInt();
	        	int pre = n%39;
	        	if(pre==0)pre=39;
	        	System.out.printf("3C%02d\n",pre);
	        	
	        }
	    }
}
	    