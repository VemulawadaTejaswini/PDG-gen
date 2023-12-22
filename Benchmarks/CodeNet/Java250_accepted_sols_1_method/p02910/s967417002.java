import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter ou = new PrintWriter(System.out);
		ArrayList<Character> al = new ArrayList<Character>();
		ArrayList<Character> la = new ArrayList<Character>();
		String s = sc.next();
		sc.close();
		for(int i = 0 ; i < s.length() ; i++){
			if(i % 2 == 0) al.add(s.charAt(i));
			else la.add(s.charAt(i));
		}
		boolean ebishu = true;
		if(al.contains('L')) ebishu = false;
		if(la.contains('R')) ebishu = false;
		if(ebishu) ou.print("Yes\n");
		else ou.print("No\n");
		ou.flush();
    }
}