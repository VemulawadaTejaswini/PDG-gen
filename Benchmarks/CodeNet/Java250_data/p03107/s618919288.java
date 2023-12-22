import java.util.*;

public class Main
{
	public static void main(String[] args)
    {
      	Scanner in = new Scanner(System.in);
      	String s = in.next();
      	int zer = 0, one = 0, len = s.length();
      	for (int i = 0; i < len; i++)
        	if (s.charAt(i) == '0')
            	zer++;
     	one = len-zer;
      	System.out.println(2*(int)(Math.min(zer, one)));
      	in.close();
    }
}