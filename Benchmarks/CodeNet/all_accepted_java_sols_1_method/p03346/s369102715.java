import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] confrom = new int[n+1];
		int[] a = new int[n];
		int ma = 0;
		for(int i = 0; i < n; i++)
		{
			a[i] = sc.nextInt();
			
			confrom[a[i]] = confrom[a[i]-1]+1;
			ma = Math.max(ma, confrom[a[i]]);
		}
		System.out.println(n-ma);

	}

}
