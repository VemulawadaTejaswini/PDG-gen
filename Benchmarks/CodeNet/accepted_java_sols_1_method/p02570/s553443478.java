import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter ou = new PrintWriter(System.out);
		int d = Integer.parseInt(sc.next());
		int t = Integer.parseInt(sc.next());
		int s = Integer.parseInt(sc.next());
		if(d <= t * s) ou.print("Yes\n");
		else ou.print("No\n");
		ou.flush();
    }
}