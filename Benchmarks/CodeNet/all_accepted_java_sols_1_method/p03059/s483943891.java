
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a,b,t;
		
		while(scan.hasNext())
		{
			a=scan.nextInt();
			b=scan.nextInt();
			t=scan.nextInt();
			
			int count=0;
			int i=0;
			while(true)
			{
				 i++;
				 if(a*i<=t)
					 count+=b;
				 else break;
			}
			System.out.println(count);
		}
	}

}
