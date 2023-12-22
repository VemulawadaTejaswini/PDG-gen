//package AtCoder;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[2*n];
		for(int i=0;i<2*n;i++)
			a[i]=sc.nextInt();
		Arrays.sort(a);
		
		int sum=0;
		for(int i=0;i<2*n;i=i+2)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);

	}

}
