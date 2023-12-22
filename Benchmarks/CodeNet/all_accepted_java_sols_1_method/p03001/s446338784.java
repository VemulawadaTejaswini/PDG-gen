import java.util.*;
 
public class Main{
	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
      	double width = scan.nextDouble();	
      	double height = scan.nextDouble();
      	double x = scan.nextDouble();
      	double y = scan.nextDouble();
      	int mi = 0;
      	System.out.print(width * height / 2.0);
      	if(width == 2 * x && height == 2 * y) {
        	mi = 1;
        }
      	System.out.print(" " + mi);
    
    }
 
 
}