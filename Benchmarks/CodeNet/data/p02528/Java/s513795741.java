import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
			double n = sc.nextDouble();
//			Integer n = Integer.valueOf(n_str);
			double[] num = new double[(int)n];
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