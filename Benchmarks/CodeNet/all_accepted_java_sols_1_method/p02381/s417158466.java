import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		PrintWriter out=new PrintWriter(System.out);
		while(true) {
			int n=in.nextInt();
			if(n==0)break;
			double s[]=new double[n], ave=0;
			
			for(int i=0;i<n;i++) {
				s[i]=Integer.parseInt(in.next());
				ave+=s[i];
			}
			ave/=n;
			double dev=0;
			for(int i=0;i<n;i++)dev+=Math.pow(s[i]-ave, 2);
			dev=Math.sqrt(dev/n);
			out.printf("%f\n",dev);
		}
		out.flush();
	}
}

