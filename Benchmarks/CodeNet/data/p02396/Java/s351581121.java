import java.util.*;

//Circle in a Rectangle
public class Main {
	public static void main(String args[])
	{
		String str;
		int[] output = new int[10000];
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		int i = 0;
		while(Integer.parseInt(str) != 0)
		{
			output[i] = Integer.parseInt(str);
			str = sc.nextLine();
			i++;
		}
		int n = 0;
		for(n = 0;n<i;n++)
		{
			System.out.println("Case " + (n+1) + ": " + output[n]);
		}
		sc.close();
	}
}

