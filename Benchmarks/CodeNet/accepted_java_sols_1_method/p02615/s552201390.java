import java.util.*;
import java.io.*;
import java.math.*;
public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter ou = new PrintWriter(System.out);
		int n = Integer.parseInt(sc.next());
		int[] a = new int[n];
		for(int i = 0 ; i < n ; i++) a[i] = Integer.parseInt(sc.next());
		sc.close();
		Arrays.sort(a);
		long yono = 0;
		for(int i = 0 ; i < n - 1 ; i++) yono += a[n - (i + 1) / 2 - 1];
		ou.println(yono);
		ou.flush();
	}
}