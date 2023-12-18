import java.io.IOException;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
    	Scanner scanner = new Scanner(System.in);
      	String s = scanner.next();
 	    char c = s.charAt(0);
        System.out.println(Character.isUpperCase(c) ? 'A' : 'a');
    }
}