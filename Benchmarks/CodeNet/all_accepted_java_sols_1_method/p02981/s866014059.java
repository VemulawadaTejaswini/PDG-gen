import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int ans = n*a < b? n*a : b;
		//ArrayList<Integer> iarr = new ArrayList<Integer>();


		System.out.println(ans);
	}

}