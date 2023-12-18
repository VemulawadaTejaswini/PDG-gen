import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		while(in.hasNext())
		{
			int a=in.nextInt();
			int b=in.nextInt();
			System.out.println(a*b/3.305785);
		}
	}
	
	static public void debug(Object... o)
	{
		System.err.println(Arrays.deepToString(o));
	}
}