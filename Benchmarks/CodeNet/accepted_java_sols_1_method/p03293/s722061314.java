import java.util.*;
import java.io.*;
import java.math.*;
public class Main{
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter ou = new PrintWriter(System.out);
		String s = sc.next();
		char[] a = s.toCharArray();
		char[] b = sc.next().toCharArray();
		sc.close();
		boolean you = false;
		for(int i = 0 ; i < s.length() ; i++){
			boolean che = true;
			for(int j = 0 ; j < s.length() ; j++){
				if(a[j] != b[(j + i) % s.length()]) che = false;
			}
			if(che) you = true;
		}
		if(you) ou.println("Yes");
		else ou.println("No");
		ou.flush();
	}
}