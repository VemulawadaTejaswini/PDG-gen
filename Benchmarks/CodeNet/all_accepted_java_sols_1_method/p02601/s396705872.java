import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	      Scanner sc = new Scanner(System.in);
	      int A = sc.nextInt(); //red
	      int B = sc.nextInt(); //green
	      int C = sc.nextInt(); //blue
	      String isClear = "No";
	      
	      int count = sc.nextInt();
	      
	      
	      for(int i = 0; i < count; i++) {
	    	  if(B > A * 2) {
	    		  A *= 2;
	    	  }else if(C > B * 2) {
	    		  B *= 2;
	    	  }else {
	    		  C *= 2;
	    	  }

	      }
	      
	      if((B > A) && (C > B)) {
	    	  isClear = "Yes";
	      }
	      
	      System.out.println(isClear);


	}
}
