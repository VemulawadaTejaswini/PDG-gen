

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //n个
		int[] arr1 = new int[n];
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=sc.nextInt();
		}
		int q = sc.nextInt(); //q
		int[] arr2 = new int[q]; //不重复的
		for(int i=0;i<arr2.length;i++)
		{
			arr2[i]=sc.nextInt();
		}
		int sum=0;
		
		
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		for(int i=0;i<arr2.length;i++)
		{
			if(Arrays.binarySearch(arr1, arr2[i])>-1)
			{
				sum++;
			}
		}
		
		System.out.println(sum);
	}
}

