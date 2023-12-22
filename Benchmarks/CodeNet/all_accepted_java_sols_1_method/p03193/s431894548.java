import java.util.*;
import java.io.*;
import java.math.*;
public class Main{
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter ou = new PrintWriter(System.out);
		int n = Integer.parseInt(sc.next());
		int h = Integer.parseInt(sc.next());
		int w = Integer.parseInt(sc.next());
		int yono = 0;
		for(int i = 0 ; i < n ; i++){
			int a = Integer.parseInt(sc.next());
			int b = Integer.parseInt(sc.next());
			if(a >= h && b >= w) yono++;
		}
		ou.println(yono);
		ou.flush();
	}
}