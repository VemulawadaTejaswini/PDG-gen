import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.HashMap;
import static java.lang.Math.*;

public class Main
{
    int n;
    
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
	n = sc.nextInt();
    }

    void out()
    {
	boolean flg = false;
	for(int i = n; i >= 0; i -= 4) {
	    if(i % 7 == 0 || i % 4 == 0) flg = true;
	}

	out(flg ? "Yes" : "No");
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
