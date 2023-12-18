
import java.util.*;

public class Main {
	static public void main(String args[]){
		Scanner sc=new Scanner(System.in);
		 
		String str=sc.next();
		if(Character.isUpperCase(str.charAt(0)))
				System.out.print("A");
		else System.out.print("a");
	}
}