import java.util.*;
import java.io.*;
import java.math.*;
public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter ou = new PrintWriter(System.out);
		int n = Integer.parseInt(sc.next());
		sc.close();
		long a = 1;
		long b = 2;
		long c = 1;
		for(int i = 0 ; i < n ; i++){
			a *= 10;
			a %= (long)(Math.pow(10 , 9) + 7);
			b *= 9;
			b %= (long)(Math.pow(10 , 9) + 7);
			c *= 8;
			c %= (long)(Math.pow(10 , 9) + 7);
		}
		ou.println((long)(a - b + c) % (long)(Math.pow(10 , 9) + 7));
		ou.flush();
	}
}