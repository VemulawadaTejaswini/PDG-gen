import java.util.Scanner;

public class Main {
	  public static void main(String args[]){
	  	Scanner sc = new Scanner(System.in);
	    int x = sc.nextInt();
	    
	    int larger = x/500;
	    
	    int smaller = x - larger*500;
	    
	    int yens = smaller/5;
	    
	    System.out.println((larger * 1000) + (yens * 5));
	  }
	}
