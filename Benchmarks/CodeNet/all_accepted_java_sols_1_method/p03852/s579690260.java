import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) throws IOException{

		Scanner sc = new Scanner(new InputStreamReader(System.in));
		String c = sc.next();

		if(c.equals("a") || c.equals("i")||c.equals("u")||c.equals("e")||c.equals("o")){
			System.out.println("vowel");
	    }else{
	    	System.out.println("consonant");
	    }
	}
}
