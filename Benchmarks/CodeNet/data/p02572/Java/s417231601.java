import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter ou = new PrintWriter(System.out);
		int n = Integer.parseInt(sc.next());
		long a = 0;
		long b = 0;
		long c = 0;
		for(int i = 0 ; i < n ; i++){
			a = Integer.parseInt(sc.next());
			b += a;
			c += (a * a) % 1000000007;
			b %= 1000000007;
			c %= 1000000007;
		}
		b *= b;
		b %= 1000000007;
		b -= c;
		b %= 1000000007;
		while(b < 0){
			b += 1000000007;
		}
		if(b % 2 != 0){
			b += 1000000007;
		}
		b /= 2;
		ou.print(b + "\n");
		ou.flush();
    }
}