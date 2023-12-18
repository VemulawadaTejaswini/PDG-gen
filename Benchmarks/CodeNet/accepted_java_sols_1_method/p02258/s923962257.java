

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//输入
		int n = sc.nextInt();
		final int MAX = 200000;
		int[] arr = new int[MAX];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int maxv = -2000000000;
		int minv = arr[0];
		
		for(int i=1;i<n;i++)
		{
			maxv = Math.max(maxv, arr[i] - minv);
			minv = Math.min(minv, arr[i]);
		}
		
		System.out.println(maxv);
	}
}

