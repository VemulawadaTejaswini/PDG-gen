import java.util.*;

public class Main {

    public static Scanner in;
 
    public static void main(String[] args) 
	{
        in = new Scanner(System.in);

        doStuff();
    }

    public static void doStuff() 
	{
        String s = in.nextLine();
		char[] c = s.toCharArray();
		char[] c2 = new char[c.length];
		for(int i = 0; i < c.length; i++)
		{
			c2[i] = c[c.length - i - 1];
		}
		
		String toRet = new String(c2);
		
		System.out.println(toRet);
    }

    public static void solve() 
	{
    
    }
}