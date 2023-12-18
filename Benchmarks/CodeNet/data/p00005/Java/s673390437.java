import java.util.Scanner;


public class Main{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine())
		{
			String[] s = sc.nextLine().split("[\\s]+");

			int a = Integer.parseInt(s[0]);
			int b = Integer.parseInt(s[1]);
			System.out.println(a +" "+ b);

			int x = gcd(a,b);
			int y = lcm(a,b);
			System.out.println(x +" "+ y);
		}
		/*



			*/
	}
	
	 private static int gcd(int m, int n)
     {
         if ((m == 0) || (n == 0)) return 0;

         while (m != n)
         {
             if (m > n) m = m - n;
             else n = n - m;
         }
         return m;
     }

     private static int lcm(int m, int n)
     {
         if ((m == 0) || (n == 0)) return 0;
         return ((m / gcd(m, n) * n));
     }
}