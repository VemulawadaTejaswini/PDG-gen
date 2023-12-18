import java.util.*;
import static java.lang.Math.*;
import java.io.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		while(sc.hasNextInt()) {
			int a=sc.nextInt(),b=sc.nextInt(),n=sc.nextInt(),ans=0;
			double count=(double)a/b;
			count-=Math.floor(count);
			String d=String.valueOf(count);
			for(int i=2;i<n+2;i++) {
				if(i>=d.length())break;
				String temp=String.valueOf(d.charAt(i));
				ans+=Integer.parseInt(temp);
			}
			System.out.println(ans);
		}
	}
}