import java.util.*;
import java.io.*;
import java.math.*;
public class Main {
    public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		PrintWriter ou = new PrintWriter(System.out);
		int n = Integer.parseInt(sc.next());
		int[] l = new int[n];
		for(int i = 0 ; i < n ; i++) l[i] = Integer.parseInt(sc.next());
		Arrays.sort(l);
		int yono = 0;
		for(int i = 0 ; i < n - 1 ; i++) yono += l[i];
		if(yono > l[n - 1]) ou.println("Yes");
		else ou.println("No");
		ou.flush();
	}
}