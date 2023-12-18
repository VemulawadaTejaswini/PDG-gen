import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter ou = new PrintWriter(System.out);
		int n = Integer.parseInt(sc.next());
		int[] a = new int[n];
		for(int i = 0 ; i < n ; i++) a[i] = Integer.parseInt(sc.next());
		sc.close();
		Arrays.sort(a);
		ou.println(a[n - 1] - a[0]);
		ou.flush();
	}
}