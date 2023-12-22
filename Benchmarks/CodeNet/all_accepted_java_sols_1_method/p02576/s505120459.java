//package abc176;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	static PrintWriter out;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		out=new PrintWriter(System.out);
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		int ans=0,time=0;
		while(ans<a) {
			ans+=b;
			time+=c;
		}
		out.println(time);
		
		out.close();
		sc.close();
	}

}
