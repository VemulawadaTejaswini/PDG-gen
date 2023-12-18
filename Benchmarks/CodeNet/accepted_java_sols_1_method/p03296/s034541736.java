import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int l = 0;
		int[] a = new int[n];
		for(int i = 0;i < n;i++)
		{
		a[i] = sc.nextInt();
		if(i > 0)
		{
		    if(a[i] == a[i - 1])
		    {
		    a[i] = -1;
		    l++;
		    }
		}
		}
		System.out.println(l);
	}
}