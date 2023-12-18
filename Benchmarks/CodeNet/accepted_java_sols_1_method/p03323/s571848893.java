import java.util.Scanner;
import java.util.*;

public class Main{
	  public static void main(String[] args) {
	      int a = 0,b=0;
	      Scanner sc = new Scanner(System.in);  
          
			a = sc.nextInt(); 
		    b = sc.nextInt();  
	      
	      if( a > 8 || b >8 ) System.out.println(":(");
	      else System.out.println("Yay!");
	  }
	}

