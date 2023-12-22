import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] a=new int[3];
		for(int i=0;i<3;i++)
		{
			a[i]=scan.nextInt();
		}
		System.out.print(a[a.length-1]+" ");
		for(int i=0;i<3-1;i++)
		{
			System.out.print(a[i]+" ");
		}
		

	}

}
