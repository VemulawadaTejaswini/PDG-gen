import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter ou = new PrintWriter(System.out);
		int w = Integer.parseInt(sc.next());
		int h = Integer.parseInt(sc.next());
		boolean ebishu = false;
		if(w == 2 * Integer.parseInt(sc.next()) && h == 2 * Integer.parseInt(sc.next())) ebishu = true;
		ou.print(w * (long)h / 2.0 + " ");
		if(ebishu) ou.print(1 + "\n");
		else ou.print(0 + "\n");
		ou.flush();
    }
}