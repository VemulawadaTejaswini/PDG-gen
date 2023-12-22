import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int t=scan.nextInt();
		double e=(t+0.5);
		int c=0,d=0;
		while(true)
		{
			d+=a;
			c+=b;
			if(d>e)
			{
				System.out.println(c-b);
				break;
			}
			
		}
		
	}

}
