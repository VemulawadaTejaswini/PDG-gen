import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		String a = stdIn.next();
		String b = stdIn.next();
		String c = stdIn.next();
		
		String d = a.toUpperCase();
		String e = b.toUpperCase();
		String f = c.toUpperCase();
		
	    char g = d.charAt(0);
	    char h = e.charAt(0);
	    char i = f.charAt(0);
	    
	    String j = String.valueOf(g);
	    String k = String.valueOf(h);
	    String l = String.valueOf(i);
	    
	    String m = j + k + l;
	    
	    System.out.println(m);
	}
}