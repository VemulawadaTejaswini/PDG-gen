import java.util.*;
import java.io.*;
import java.math.*;
public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter ou = new PrintWriter(System.out);
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		int c = Integer.parseInt(sc.next());
		int d = Integer.parseInt(sc.next());
		sc.close();
		long n = Math.max(a * (long)c , Math.max(b * (long)d , Math.max(a * (long)d , b * (long)c)));
		ou.println(n);
		ou.flush();
	}
}