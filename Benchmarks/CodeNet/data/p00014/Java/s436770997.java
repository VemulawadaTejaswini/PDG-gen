
import java.util.Scanner;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Integral();
	}
	
	private static void Integral ()
	{
		int d;
		int a = 0;
		int ans = 0;
		Scanner cin = new Scanner (System.in);
		
		while (cin.hasNext()){
			d = cin.nextInt();
			for (int i = 0; i <= 600 - d; i = d * a){
				ans += i * i * d;
				a++;
			}
			System.out.println(ans);
			ans = 0;
			a = 0;
		}
	}
}