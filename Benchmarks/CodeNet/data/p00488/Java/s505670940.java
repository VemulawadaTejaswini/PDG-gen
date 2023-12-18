import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int[] p=new int[3];
		int[] j=new int[2];
		
		for(int i=0; i<3; i++)p[i] = sc.nextInt();
		for(int i=0; i<2; i++)j[i] = sc.nextInt();
		
		int pMin=p[0], jMin=j[0];
		for(int i=1; i<3; i++)if(p[i] < pMin)pMin = p[i];
		for(int i=1; i<2; i++)if(j[i] < jMin)jMin = j[i];
		
		System.out.println(pMin+jMin-50);
	}
}