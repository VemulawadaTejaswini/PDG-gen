import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int n;
		Scanner scan = new Scanner(System.in);
		n=scan.nextInt();
		int[] a =new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=scan.nextInt();
		}
		for(int i=n-1;i>0;i--)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println(a[0]);
	}
}