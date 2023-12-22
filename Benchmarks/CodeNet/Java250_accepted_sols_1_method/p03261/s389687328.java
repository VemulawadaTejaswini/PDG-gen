/*package whatever //do not write package name here */

import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		LinkedList<String> ll = new LinkedList<>();
		int n = sc.nextInt();
		sc.nextLine();
		int f = 0;
		while(n-- != 0)
		{
		    String s = sc.nextLine();
		    if(lhs.contains(s))
		    f = 1;
		    lhs.add(s);
		}
		if(f == 1)
		System.out.print("No");
		else
		{
		    ll.addAll(lhs);
		    for(int i = 0;i < ll.size() - 1;i++)
		    {
		        String s1 = ll.get(i);
		        String s2 = ll.get(i + 1);
		        if(s1.charAt(s1.length() - 1) != s2.charAt(0))
		        {
		        f = 1;
		        break;
		        }
		    }
		    if(f == 1)
		    System.out.print("No");
		    else
		    System.out.print("Yes");
		}
	}
}