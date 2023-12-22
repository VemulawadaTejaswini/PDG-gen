import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			int sum = 0;
			int n = sc.nextInt();
			if(n == 0)
				break;
			int max = sc.nextInt();
			int min = sc.nextInt();
			if(max < min)
			{
				int tmp = max;
				max = min;
				min = tmp;
			}
			for(int i = 0 ; i < n - 2 ; i++)
			{
				int x = sc.nextInt();
				if(x > max)
				{
					sum += max;
					max = x;
				}
				else if(x < min)
				{
					sum += min;
					min = x;
				}
				else
					sum += x;
			}
			System.out.println(sum / (n - 2));
		}
	}
}
