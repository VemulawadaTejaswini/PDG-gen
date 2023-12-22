import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int[] a= new int[n];
		int c=0;
		for(int i=0;i<n;i++)
		{
			a[i]=i+1;
			if(a[i]%2!=0) 
			{
				c++;
			}
		}
		double x=(double)c/n;
		System.out.println(x);

	}

}
