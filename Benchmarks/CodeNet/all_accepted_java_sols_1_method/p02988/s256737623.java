

import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int nums=sc.nextInt();
		int[] arr= new int[nums];
		for(int i=0;i<nums;i++) {
			arr[i]=sc.nextInt();
		}
		int num=0;
		for(int i=0;i<arr.length-2;i++) {
			if(arr[i]>arr[i+1]) {
				if(arr[i+1]>arr[i+2]) {
					num++;
				}
			}else if(arr[i]<arr[i+1]) {
				if(arr[i+1]<arr[i+2]) {
					num++;
				}
			}
		}
		System.out.println(num);
		
	}
}
