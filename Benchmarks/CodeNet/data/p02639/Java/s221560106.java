import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int[] a=new int[n];
		for(int i=0;i<=a.length-1;i++)
		{
			a[i]=scan.nextInt();
		}
		int count=0;
			for(int i=0;i<=a.length-1;i++)
			{

			if(a[i]==0)
			{
				System.out.println(count+1);
			}
			else 
			{
				count++;
			}
	
		}

	}

}
