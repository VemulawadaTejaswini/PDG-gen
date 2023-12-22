import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String y = scan.next();
      	if(y.charAt(2) == y.charAt(3) && y.charAt(4) == y.charAt(5)){
         System.out.println("Yes"); 
        }
      else{
       System.out.println("No"); 
      }
	}

}
