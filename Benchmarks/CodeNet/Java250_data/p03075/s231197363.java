import java.util.*;
import java.io.*;
import java.math.*;
public class Main{
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter ou = new PrintWriter(System.out);
		int[] a = new int[5];
		for(int i = 0 ; i < 5 ; i++) a[i] = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());
		sc.close();
		Arrays.sort(a);
		if(k >= a[4] - a[0]) ou.println("Yay!");
		else ou.println(":(");
		ou.flush();
	}
}