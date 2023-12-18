import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		if(n%1000==0) System.out.println("0");
		else
		{
			while(true)
			{
				n-=1000;
				if(n%1000!=0)
				{
					System.out.println(Math.abs(1000-n));
					break;
				}
			}
			
		}
	}

}
