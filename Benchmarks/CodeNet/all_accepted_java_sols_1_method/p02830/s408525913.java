import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter ou = new PrintWriter(System.out);
		int n = Integer.parseInt(sc.next());
		String s = sc.next();
		String t = sc.next();
		for(int i = 0 ; i < n ; i++){
			ou.print(s.charAt(i) + "" + t.charAt(i));
		}
		ou.print("\n");
		ou.flush();
    }
}