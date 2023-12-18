import java.util.*;
import java.io.*;
import java.math.*;
public class Main{
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter ou = new PrintWriter(System.out);
		int[] a = new int[2];
		for(int i = 0 ; i < 2 ; i++) a[i] = Integer.parseInt(sc.next());
		sc.close();
		int yono = 0;
		for(int i = 0 ; i < 2 ; i++){
			Arrays.sort(a);
			yono += a[1];
			a[1]--;
		}
		ou.println(yono);
		ou.flush();
	}
}