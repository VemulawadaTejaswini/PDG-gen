import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		 Scanner scan = new Scanner(System.in);
	     String str = scan.nextLine();
	     String[] chars = str.split("");
	     boolean oddFlag = true;
	     for(String c : chars) {
	    	 if(oddFlag) {
	    		 if(c.equals("L")) {
	    			 System.out.println("No");
	    			 return;
	    		 }
	    	 }
	    	 else {
	    		 if(c.equals("R")) {
	    			 System.out.println("No");
	    			 return;
	    		 }
	    	 }
	    	 oddFlag = !oddFlag;
	     }
	     System.out.println("Yes");
	}

}
