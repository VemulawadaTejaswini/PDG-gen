import java.util.*;
import java.lang.*;
 
class Main{
	public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    char line = sc.next().toCharArray()[0];
    if(Character.isLowerCase(line)){
    	System.out.println("a");
    	}
      else {
      	System.out.println("A");
      }
    }
}