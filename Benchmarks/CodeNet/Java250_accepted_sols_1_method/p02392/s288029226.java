import java.util.*;

//input a b c is a < b < c?
public class Main {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String[] input = sc.nextLine().split(" ");
		int [] abc = new int[input.length];
		for(int i = 0;i<abc.length;i++)
		{
			abc[i] = Integer.parseInt(input[i]);
		}
		String str;
		if(abc[0] < abc[2])
		{
			if(abc[1] < abc[2])
			{
				if(abc[0] < abc[1])
				{
					str = "Yes";
				}
				else
				{
					str = "No";
				}
			}
			else
			{
				str = "No";
			}
		}
		else
		{
			str = "No";
		}
		System.out.println(str);

		sc.close();
	}
}

