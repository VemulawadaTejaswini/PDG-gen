import java.util.*;
import java.io.*;
class Main{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out, true);
		long x = in.nextLong();
		long k = in.nextLong();
		long d = in.nextLong();

		long step = Math.min(k, x/d);
		k = k - step;
		long pos = x - (step * d);
		if(k == 0){
			out.println(Math.abs(pos));
		}
		else{
			if(k % 2 == 0)
				out.println(pos);
			else
				out.println(Math.abs(pos - d));
		}
	}
}
