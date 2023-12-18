

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		int ar[]=new int[3];
		ar[0]=a;ar[1]=b;ar[2]=c;
		Arrays.sort(ar);
		int aa=ar[2]-ar[0];
		int two=ar[2]-ar[1];
		
		int min=Math.min(aa, two);
		int max=Math.max(aa, two);
//		aa=Math.min(aa, two);
		ar[0]=aa;
		ar[1]=two;
//		System.out.println(ar[0]+" "+ar[1]);
		if(ar[0]%2==0 && ar[1]%2==0)
		{
			System.out.println(ar[0]/2+ar[1]/2);
		}else if(ar[0]%2==1 && ar[1]%2==1)
		{
			System.out.println((ar[0]/2)+(ar[1]/2)+1);
		}else {
			System.out.println(((ar[0]+1)/2)+((ar[1]+1)/2)+1);
		}
//		System.out.println(operations);
			
	}
}
