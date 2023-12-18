import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int i=1;
		// ?¨??????\???????????????????????????????????????
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		while(true)
		{
			int x=i;
			while(true)
			{
				
				if ( x % 10 == 3 ){
					System.out.printf(" %d", i);
					break;
				}
				else
				{
					x /= 10;
					if(x==0)break;
				}
			}
			if ( ++i > n )
			{
				System.out.print("\n");
				break;
			}
		}
	}
}