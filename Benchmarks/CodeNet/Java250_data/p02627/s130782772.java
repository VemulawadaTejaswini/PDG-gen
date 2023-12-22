import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
	public static void main (String[] args) {
      Scanner sc = new Scanner(System.in); 
   
        // Character input 
       char c = sc.next().charAt(0); 
       if(c>='A' && c<='Z'){
         System.out.println("A");
       }else{
       	System.out.println("a");
       }
    }
}