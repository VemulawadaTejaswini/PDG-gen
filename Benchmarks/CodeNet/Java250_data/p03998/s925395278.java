import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.HashMap;

public class Main
{
    String[] p = new String[3];
    
    public static void main(String args[])
    {
	new Main().solve();
    }
    
    void solve()
    {
	in();

	char[] abc = {'A', 'B', 'C'};

	int t = 0;
	while(p[t].length() > 0) {
	    char c = p[t].charAt(0);
	    p[t] = p[t].substring(1, p[t].length());
	    if(c == 'a') t = 0;
	    if(c == 'b') t = 1;
	    if(c == 'c') t = 2;
	}

	out(abc[t]);
    }

    void in()
    {
	Scanner sc = new Scanner(System.in);
	p[0] = sc.next();
	p[1] = sc.next();
	p[2] = sc.next();
    }

    void out()
    {
	
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
	System.out.println(c);
    }
    
    void out(String s)
    {
	System.out.println(s);
    }
}
