import java.util.*;
import java.io.*;
import java.math.*;
public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter ou = new PrintWriter(System.out);
		int x = Integer.parseInt(sc.next());
		boolean a = true;
		int aa = x;
		int i = 0;
		while(a){
			i++;
			if(x % 360 == 0){
				a = false;
				ou.println(i);
			}
			x += aa;
		}
		ou.flush();
	}
}