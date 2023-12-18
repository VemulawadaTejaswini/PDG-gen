

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//输入
		int N = sc.nextInt();
		int[] arr = new int[N];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		for(int a=0;a<arr.length;a++)
		{
			if(a==arr.length-1)
			{
				System.out.print(arr[a]);
			}
			else
			{
				System.out.print(arr[a]+" ");
			}
		}
		
		System.out.println();
		
		insertionSort(arr);
		
	}
	
	public static void insertionSort(int[] arr)
	{
		int i,j,v;
		for(i=1;i<arr.length;i++)
		{
			v = arr[i];  //取出未排序的
			j = i-1;  //已排序的最后一个
			while(j>=0&&arr[j]>v) //已排序中大于
			{
				arr[j+1] = arr[j];
				j--;
			}
			
			arr[j+1] = v;
			
			for(int a=0;a<arr.length;a++)
			{
				if(a==arr.length-1)
				{
					System.out.print(arr[a]);
				}
				else
				{
					System.out.print(arr[a]+" ");
				}
			}
			
			System.out.println();
			
		}
		
	}
}

