import java.util.*;
public class Main {

	public static int finddiff(String s, String t)
	{
		int res = 0;
		if(t.length()>s.length())
			return Integer.MAX_VALUE;
		for(int i=0;i<t.length();i++)
				if(t.charAt(i)!=s.charAt(i))
					res++;
		return res;
	}
	public static void main(String[] args) {		
		Scanner scn = new Scanner(System.in);
		String s = scn.next();
		String t = scn.next();
		int min = t.length();
		for(int i=0;i<=s.length()-t.length();i++)
		{
			int val = finddiff(s.substring(i),t);
			if(min>val)
				min = val;
		}
		System.out.println(min);
	}
// codeforces coderraces
}
