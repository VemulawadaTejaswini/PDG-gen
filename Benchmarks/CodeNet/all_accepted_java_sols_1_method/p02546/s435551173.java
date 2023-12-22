import java.util.*;
import java.io.*;
import java.math.*;
public class Main {
    public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		PrintWriter ou = new PrintWriter(System.out);
		String s = sc.next();
		ou.print(s);
		if(s.charAt(s.length() - 1) == 's') ou.println("es");
		else ou.println("s");
		ou.flush();
	}
}