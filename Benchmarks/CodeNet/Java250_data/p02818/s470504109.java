    import java.util.*;
	import java.lang.Math;
    public class Main
	{
		public static void main(String args[])
		{
			Scanner scan = new Scanner(System.in);
			long a = scan.nextLong();
			long b = scan.nextLong();
			long k = scan.nextLong();
			//System.out.println(a);
			long temp=Math.min(a,k);
			a=a-temp;
			k=k-temp;
			temp=Math.min(b,k);
			b=b-temp;
			System.out.print(a);
			System.out.print(" ");
			System.out.print(b);
		}
    }