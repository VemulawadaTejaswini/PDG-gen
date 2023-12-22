import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		String op = scanner.next();
		int b = scanner.nextInt();
        	List<Integer> list = new ArrayList<Integer>();
		String sum = "+";
		String dif = "-";
		String mul = "*";
		String div = "/";
		String fin = "?";
		int ans = 0;
		while(!(op.equals(fin)))
		{
			if (op.equals(sum))
			{
				ans = a + b;
			}
			if (op.equals(dif))
			{
				ans = a - b;
			}
			if (op.equals(mul))
			{
				ans = a * b;
			}
			if (op.equals(div))
			{
				ans = a / b;
			}
			list.add(ans);
			a = scanner.nextInt();
			op = scanner.next();
			b = scanner.nextInt();
		}
		for(Iterator it = list.iterator(); it.hasNext();) 
		{
            		System.out.println(it.next());
       		}
	}
}
		
