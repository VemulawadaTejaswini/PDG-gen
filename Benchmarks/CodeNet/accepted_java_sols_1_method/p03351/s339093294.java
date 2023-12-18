import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		  Scanner sc = new Scanner(System.in);
		  int a = sc.nextInt();
		  int b = sc.nextInt();
		  int c = sc.nextInt();
		  int d = sc.nextInt();
		  sc.close();
		  
		  boolean flag = false;
	      
		  if(Math.abs(a - c) <= d) {
			  flag = true;
		  }else {
			  if(Math.abs(a - b) <= d && Math.abs(b - c) <= d) {
				  flag = true;
			  }
		  }
		  
		  if(flag) {
			  System.out.println("Yes");
		  }else {
			  System.out.println("No");
		  }
	      System.exit(0);
	    }
}