import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
	String s=ob.next();
	if(s.charAt(s.length()-1)=='s'){System.out.println(s+"es");}
	else{System.out.println(s+"s");}
	}
}
