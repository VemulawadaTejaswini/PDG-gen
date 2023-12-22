import java.util.*;
public class Main {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt(), b = scan.nextInt();
		ArrayList<String> ABC = new ArrayList<String>();
		String output = "";
		for (int i = 0;  i < a; i++ )
		{
			ABC.add(scan.next());
		}
		
		for (int i = 0; i < a;i++)
		{
			String small = ABC.get(0);
			for (int x = 1; x < ABC.size();x++)
			{
				if (small.compareTo(ABC.get(x)) > 0) small = ABC.get(x);
			}
			output+=small;
			ABC.remove(small);
		}
		System.out.println(output);
	}
}