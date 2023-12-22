import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws Exception {
	    Scanner sc = new Scanner(System.in);   
	    
	    float A = sc.nextFloat();
	    float B = sc.nextFloat();
	    
	    System.out.println(Math.round((A + B) / 2));
	}    
}	