
import java.util.*;
import java.io.*;
import java.math.BigDecimal;
import java.awt.geom.*;
import static java.util.Arrays.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int n = Integer.parseInt(sc.next());
		long[] fib = new long[n+1];
		fib[0] = 1;
		fib[1] = 1;
		for(int i=2;i<=n;i++){
			fib[i] = fib[i-1] + fib[i-2];
		}

		out.println(fib[n]);
		out.flush();
	}
}