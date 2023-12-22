import java.util.Scanner;

public class Main {

	public static void main(String[] args){
	      Scanner sc = new Scanner(System.in);
	      int a = sc.nextInt();
	      int b = sc.nextInt();
	      sc.close();
	      
	      int count = 0;
	      count = count + (a - 1);
	      if(b >= a) {
	    	  	count++;
	      }
	      
	      System.out.println(count);
	      System.exit(0);
	    }
}