import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter ou = new PrintWriter(System.out);
		String s = sc.next();
		sc.close();
		int a = 0;
		int z = s.length() - 1;
		boolean k = true;
		while(k){
			if(s.charAt(a) == 'A') break;
			a++;
		}
		k = true;
		while(k){
			if(s.charAt(z) == 'Z') break;
			z--;
		}
		ou.println(z - a + 1);
		ou.flush();
    }
}