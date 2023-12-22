import java.util.*;

public class Main{
 	
  public static void main(String... args){
  		Scanner scanner = new Scanner(System.in);
 		int s = scanner.nextInt();
    	int w = scanner.nextInt();
    	
    	System.out.println(w>=s? "unsafe":"safe");
  }
}