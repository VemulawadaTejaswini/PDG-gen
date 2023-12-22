import java.util.*;
import java.io.*;
import java.math.*;
public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter ou = new PrintWriter(System.out);
		int k = Integer.parseInt(sc.next());
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		sc.close();
		if(a >= b) ou.println(k + 1);
		else{
			if(k < a) ou.println(k + 1);
			else{
				long yono = a;
				long s = k + 1;
				k -= a - 1;
				if(k % 2 == 1) yono++;
				k /= 2;
				yono += (b - a) * (long)k;
				ou.println(Math.max(yono , s));
			}
		}
		ou.flush();
	}
}