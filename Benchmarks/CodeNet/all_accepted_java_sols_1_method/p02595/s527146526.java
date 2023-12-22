import java.io.PrintWriter;
import java.util.*;
public class Main{
	
	public static void main(String[]args) {
		PrintWriter out = new PrintWriter(System.out);
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		long d=sc.nextLong();
		int c=0;
		for(int i=0;i<n;i++) {
			long a=sc.nextLong();
			long b=sc.nextLong();
			if((a*a+b*b)<=d*d)c++;
		}
		out.println(c);
		out.close();
	}
}