import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n];
		HashMap<Long, Integer> oriin = new HashMap<>();
		
		for(int i = 0; i < n; i++)
		{
			a[i] = sc.nextLong();
			oriin.put(a[i], (i%2));
		}
		
		int wr = 0;
		long[] b = a.clone();
		Arrays.sort(b);
		for(int i = 0; i < n; i++)
		{
			int ori = oriin.get(b[i]);
			if(ori != (i%2))
				wr++;
		}
		
		wr/=2;
		System.out.println(wr);
	}

}
