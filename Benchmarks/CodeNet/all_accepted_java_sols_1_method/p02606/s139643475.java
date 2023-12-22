import java.util.*;
class Main{
	public static void main (String args[])
	{
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		int c=in.nextInt();
		int diff=(b-a)/c;
		if(a%c==0 || b%c==0)
			diff=diff+1;
		System.out.println(diff);
	}
}