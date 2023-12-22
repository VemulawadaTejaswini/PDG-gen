import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter ou = new PrintWriter(System.out);
		String s = sc.next();
		sc.close();
		boolean ebishu = true;
		for(int i = 0 ; i < (s.length() - 1) / 2 && ebishu ; i++){
			if(s.charAt(i) != s.charAt(s.length() - i - 1)) ebishu = false;
			if(s.charAt(i) != s.charAt((s.length() - 1) / 2 - i - 1)) ebishu = false;
			if(s.charAt((s.length() - 1) / 2 + 1 + i) != s.charAt(s.length() - 1 - i)) ebishu = false;
		}
		if(ebishu) ou.print("Yes\n");
		else ou.print("No\n");
		ou.flush();
    }
}