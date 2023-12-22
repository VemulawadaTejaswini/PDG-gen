import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter ou = new PrintWriter(System.out);
		int[] a = new int[4];
		for(int i = 0 ; i < 4 ; i++){
			a[i] = Integer.parseInt(sc.next());
		}
		ou.print((a[0] - a[2]) * (a[1] - a[3]));
		ou.flush();
    }
}