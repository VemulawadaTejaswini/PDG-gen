import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s=in.next();
		for(int i=0;i<s.length();i++)
		{
			if((i+1)%2!=0)
			{
				if(s.charAt(i)!='R' && s.charAt(i)!='U' && s.charAt(i)!='D')
				{
					System.out.println("No");
					System.exit(0);
				}
			}
			else if((i+1)%2==0)
			{
				if(s.charAt(i)!='L' && s.charAt(i)!='U' && s.charAt(i)!='D')
				{
					System.out.println("No");
					System.exit(0);
				}
			}
		}
		System.out.println("Yes");
	}
}
