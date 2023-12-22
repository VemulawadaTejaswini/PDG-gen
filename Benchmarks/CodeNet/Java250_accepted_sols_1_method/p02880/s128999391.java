import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int N =sc.nextInt();
		Boolean flg = false;

		for(int i = 1; 10 > i; i++)
		{
			if(N % i == 0)
			{
				if((N / i) < 10) {
					flg = true;
					break;
				}
			}
		}
		System.out.println(flg?"Yes":"No");
	}
}