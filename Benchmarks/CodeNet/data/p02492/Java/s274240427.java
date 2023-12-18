import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		int flg = 1, a, b, i = 0, j;
		int ans[] = new int[128];
		do
		{
			Scanner sc = new Scanner(System.in);
			a = sc.nextInt();
			String op = sc.next();
			b = sc.nextInt();
			
			switch(op.charAt(0))
			{
				case '+':
					ans[i] = a + b;
					break;
				case '-':
					ans[i] = a - b;
					break;
				case '*':
					ans[i] = a * b;
					break;
				case '/':
					ans[i] = a / b;
					break;
				case '?':
					flg--;
					break;
			}
			
			i++;
		} while(flg > 0 || i == 128);
		
		for(j = 0; j < i; j++)
		{
			if(j != i - 1)
			{
				System.out.println(ans[j]);
			}
		}
	}
}