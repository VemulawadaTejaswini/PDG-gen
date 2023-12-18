import java.util.*;
import java.io.*;
import java.math.*;
public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter ou = new PrintWriter(System.out);
		int n = Integer.parseInt(sc.next());
		int[] p = new int[n];
		int yono = 0;
		for(int i = 0 ; i < n ; i++){
			p[i] = Integer.parseInt(sc.next());
			yono += p[i];
		}
		sc.close();
		Arrays.sort(p);
		ou.println(yono - p[n - 1] / 2);
		ou.flush();
	}
}