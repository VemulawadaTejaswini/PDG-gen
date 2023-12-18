import java.util.Arrays;
import java.util.Scanner;

public class aoj10029 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
			String n_str = sc.next();
			Integer n = Integer.valueOf(n_str);
			long[] num = new long[n];
		for(int i = 0;i != n; i++)
		{
			num[i] = sc.nextLong();
		}
			Arrays.sort(num);
		for(int i = 0;i != n; i++)
		{
			if(i < n-1)
			{
				System.out.print(num[i] + " ");
			} else {
				System.out.println(num[i]);
			}
		}
	}
}