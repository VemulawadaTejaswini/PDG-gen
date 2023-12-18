
import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		PrintWriter out=new PrintWriter(System.out);
		int n=Integer.parseInt(in.next());
		
		for(int i=0;i<n;i++) {
			int Y=Integer.parseInt(in.next()),M=Integer.parseInt(in.next()),D=Integer.parseInt(in.next());
			int res=0;
			
			int d;
			if(Y%3==0 || (Y%3!=0 && M%2==1))d=20;
			else d=19;
			for(int j=D;j<=d;j++) {
				res++;
			}
			M++;
			
			int m[]=new int[2];
			if(Y%3==0) {
				m[0]=20;
				m[1]=20;
			}
			else {
				m[0]=19;
				m[1]=20;
			}
			
			for(int j=M;j<=10;j++) {
				res+=m[j%2];
			}
			
			Y++;
			
			for(int j=Y;j<=999;j++) {
				res+=(j%3==0)? 200:195;
			}
			
			out.println(res);
		}
		out.flush();
	}
}

