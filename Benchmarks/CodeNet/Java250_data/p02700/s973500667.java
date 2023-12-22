import java.util.*;
class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int H1 = sc.nextInt();
		int A1 = sc.nextInt();
		int H2 = sc.nextInt();
		int A2 = sc.nextInt();
		
		while(true)
		{
			H2 -= A1;
			if(H2 <= 0)
			{
				System.out.println("Yes");
				break;
			}
			
			H1 -= A2;
			if(H1 <= 0)
			{
				System.out.println("No");
				break;
			}
		}
	}
}