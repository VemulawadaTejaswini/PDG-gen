

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.BinaryOperator;

import javax.rmi.ssl.SslRMIClientSocketFactory;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		int cnt=0;
		int n=scan.nextInt();
		int[] arr1=new int[n];
		
		for(int i=0;i<n;i++){
			arr1[i]=scan.nextInt();
		}
		Arrays.sort(arr1);
		
		int m=scan.nextInt();
		for(int i=0;i<m;i++){
			int t=scan.nextInt();
			if(binary(arr1,t))
				cnt++;
		}
		
		System.out.println(cnt);
	}

	private static boolean binary(int[] arr, int key) {
		// TODO Auto-generated method stub
		int low=0,high=arr.length;
		
		while(low<=high){
			int mid=(low+high)/2;
			if(arr[mid]>key)
				high=mid-1;
			else if(arr[mid]<key)
				low=mid+1;
			else return true;
		}
		return false;
	}

}

