import java.util.*;
public class Main {
	static String str,p;
	static int l,ct;
	static long ans,a,b,c;
	static long[] aa=new long[100];
	static char[] bb=new char[100];
	static Stack<Long> s=new Stack<Long>();

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		str=in.next();ans=in.nextInt();
		l=str.length();
		p="";ct=0;
		for(int i=0;i<l;i++)
		{
			if(str.charAt(i)<'9'&&str.charAt(i)>'0')
				p+=str.charAt(i);
			else
			{
				c=Long.parseLong(p);p="";
				aa[ct]=c;bb[ct++]=str.charAt(i);
			}
		}
		c=Long.parseLong(p);aa[ct]=c;
		a=aa[0];
		for(int i=0;i<ct;i++)
		{
			if(bb[i]=='+') a+=aa[i+1];
			else a*=aa[i+1];
		}
		s.push(aa[0]);
		for(int i=0;i<ct;i++)
		{
			if(bb[i]=='*')
			{
				c=s.pop();c=c*aa[i+1];
				s.add(c);
			}
			else s.add(aa[i+1]);
		}
		while(!s.isEmpty())
		{
			c=s.pop();
			b+=c;
		}
		if(a!=ans&&b!=ans)
			System.out.println("I");
		else if(a==ans&&b==ans)
			System.out.println("U");
		else if(b==ans)
			System.out.println("M");
		else System.out.println("L");
	}
}