import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		 Scanner scan = new Scanner(System.in);
	     String str = scan.nextLine();
	     String[] chars = str.split(" ");
	     int N= Integer.valueOf(chars[0]);
	     int M;
	     for(int i=9;i>0;i--) {
	    	 if(N%i==0) {
	    		M = N/i;
	    		if(0<M&M<10) {
	    			System.out.println("Yes");
	    			return;
	    		}
	    	 }
	     }
	     System.out.println("No");
	}

}
