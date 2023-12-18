import java.util.*;
import java.io.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		HashMap hs = new HashMap();
		PrintWriter ou = new PrintWriter(System.out);
		int[] a = new int[3];
		for(int i = 0 ; i < 3 ; i++){
			a[i] = Integer.parseInt(sc.next());
		}
		ou.print(a[2] / a[0] * a[1] + "\n");
		ou.flush();
	}
}