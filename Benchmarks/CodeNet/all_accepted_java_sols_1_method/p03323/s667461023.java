import java.util.*;
import java.io.FileInputStream;
import java.io.InputStream;
 
public class Main {
 
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		int a = scan.nextInt();
      	int b = scan.nextInt();
      
      if(a > 8 || b > 8)
        System.out.println(":(");
      else 
        System.out.println("Yay!");
		
	}
	
}