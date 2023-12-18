    import java.util.*;
	import java.lang.Math;
    public class Main
	{
		public static void main(String args[])
		{
			Scanner scan = new Scanner(System.in);
			int n = scan.nextInt();
			String s = scan.next();
			String m="";
			for(int i=0;i<s.length();i++)
			{
				if(s.charAt(i)+n > 'Z')
				{
					m = m+ (char)('A'+(s.charAt(i)+n-'Z'-1));
				}
				else
					m = m+ (char)(s.charAt(i)+n);
			}
			System.out.println(m);
		}
    }