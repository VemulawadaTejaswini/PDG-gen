import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
			while(sc.hasNext())
			{
				long a = sc.nextLong();
				long b = sc.nextLong();
				long d = a * b;
				long r = 1;
					if(a%b==0){
						System.out.println(b +" "+ d/b);
						continue;
					} else if(b%a==0){
						System.out.println(a +" "+ d/a);continue;
					}
					while(a%b != 0 || b%a != 0)
					{
						r = a % b;
						a = b;
						b = r;
					}
						System.out.println(r +" "+ d/r);
			}
	}
}