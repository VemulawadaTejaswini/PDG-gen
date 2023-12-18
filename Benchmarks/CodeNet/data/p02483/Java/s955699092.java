import java.util.*;

public class Main
{

	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b= sc.nextInt();
		int c = sc.nextInt();
		int[] ar = new int[]{a ,b, c};
		if(ar[0] > ar[1])
		{
			int i = ar[0], j = ar[1];
			ar[0] = j;
			ar[1] = i;
		}
		if(ar[1] > ar[2])
		{
			int i = ar[1], j = ar[2];
			ar[1] = j;
			ar[2] = i;			
		}
		if(ar[0] > ar[1])
		{
			int i = ar[0], j = ar[1];
			ar[0] = j;
			ar[1] = i;
		}		
		
		String s = ar[0] + " " + ar[1]  +" " + ar[2];
		System.out.println(s);
	}
}