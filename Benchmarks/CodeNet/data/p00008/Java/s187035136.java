import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum=0;
		while(sc.hasNext())
		{
			sum=0;
			int n= sc.nextInt();
			for(int i=0;i<=9;i++)
			{
				for(int j=0;j<=9;j++)
				{
					for(int k=0;k<=9;k++)
					{
						for(int a=0;a<=9;a++)
						{
							if((i+j+k+a)==n){sum++;System.out.println(a+" "+i+" "+j+" "+k);}
						}
					}
				}
			}
			System.out.println(sum);
		}
		

	}

}