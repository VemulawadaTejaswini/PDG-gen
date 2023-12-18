import java.util.Scanner;
import java.lang.Character;
 
public class Main {
 
	public static void main(String[] args) {
      
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
        Character c = new Character();
 
		if(c.isUpperCase(a))System.out.println("A");
        else System.out.println("B");
 
	}
 
}