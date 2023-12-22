import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int n=3;
		int[] a= new int[2];
		int sum=0;
		for(int i=0;i<2;i++)
		{
			a[i]=scan.nextInt();
			sum+=a[i];
		}
		n=n*(n+1)/2;
		System.out.println(n-sum);
	}

}
