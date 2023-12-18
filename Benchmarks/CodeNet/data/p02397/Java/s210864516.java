import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
 
class Main
{
	public static void main(String[] args)
	{
        	List<Integer> num1 = new ArrayList<Integer>();
		List<Integer> num2 = new ArrayList<Integer>();
		Scanner scanner = new Scanner(System.in);
        	int x = 1;
		int y = 1;
 		while(!(x == 0) || !(y == 0))
		{
			x = scanner.nextInt();
			y = scanner.nextInt();
			if(x == 0 && y == 0)
			{
				break;
			}
			if(x <= y)
			{ 
				num1.add(x);
				num2.add(y);
			}
			if(x > y)
			{
				num1.add(y);
				num2.add(x);
			}
		}
		for(int i=0; i<num1.size(); ++i)
		{
			System.out.println(num1.get(i) + " " + num2.get(i));
		}
    	}
}
