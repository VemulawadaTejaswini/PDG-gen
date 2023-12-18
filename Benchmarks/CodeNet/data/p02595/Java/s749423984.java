import java.io.PrintWriter;
import java.util.*;
public class Main{
	
	public static void main(String[]args) {
		PrintWriter out = new PrintWriter(System.out);
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int d=sc.nextInt();
		int c=0;
		for(int i=0;i<n;i++) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			a=(int)Math.pow(a, 2);
			b=(int)Math.pow(b, 2);
			int aa=(int)Math.ceil(Math.sqrt(a+b));
			if(aa<=d)c++;
		}
		out.println(c);
		out.close();
	}
}