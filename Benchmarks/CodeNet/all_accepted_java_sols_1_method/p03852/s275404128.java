import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	String c = scan.next();

	if(c.charAt(0) == 'a' ||
	   c.charAt(0) == 'i' ||
	   c.charAt(0) == 'u' ||
	   c.charAt(0) == 'e' ||
	   c.charAt(0) == 'o'){
	    System.out.println("vowel");
	}else{
	    System.out.println("consonant");
	}
    }
}
