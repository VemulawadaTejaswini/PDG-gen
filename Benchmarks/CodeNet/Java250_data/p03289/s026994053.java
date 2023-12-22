import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.HashMap;
import static java.lang.Math.*;

public class Main
{
    String s;
    
    public static void main(String args[])
    {
	new Main().solve();
    }
    
    void solve()
    {
	in();

	out();
    }

    void in()
    {
	Scanner sc = new Scanner(System.in);
	s = sc.next();
    }

    void out()
    {
	int cnt = 0;
	for(int i = 0; i < s.length(); i++) {
	    char c = s.charAt(i);
	    if(c < 'A' || 'Z' < c) cnt++;
	}

	int sl = s.length();
	
	if(s.charAt(0) == 'A' && s.substring(2, sl - 1).indexOf("C") != -1 && sl == cnt + 2)
	    out("AC");
	else
	    out("WA");
	
    }
    
    void out(int n)
    {
	System.out.println(n);
    }

    void out(double n)
    {
	System.out.println(n);
    }

    void out(long n)
    {
	System.out.println(n);
    }
    
    void out(char c)
    {
	System.out.print(c);
    }
    
    void out(String s)
    {
	System.out.println(s);
    }
}
