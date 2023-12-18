


import java.util.Scanner;

public class Main {

	public static int cnt=0;
	
	public static int[] L=new int[500000/2+2];
	public static int[] R=new int[500000/2+2];
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan =new Scanner(System.in);
		int n=scan.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=scan.nextInt();
		}
		long sum=mergeSort(arr,n,0,n);
		System.out.println(sum);
		//arrPrint(arr);
		//System.out.println(cnt);
	}

	private static long mergeSort(int[] arr, int n, int low, int high) {
		// TODO Auto-generated method stub
		if(low+1<high){
			int mid=(low+high)/2;
			long v1=mergeSort(arr, n, low, mid);
			long v2=mergeSort(arr, n, mid, high);
			long v3=merge(arr, n, low, mid,high);
			return v1+v2+v3;
		}
		else return 0;
	}

	private static long  merge(int[] arr, int n, int low, int mid,int high){
		// TODO Auto-generated method stub
		long res=0;
		int n1=mid-low;
		int n2=high-mid;
		for(int i=0;i<n1;i++) L[i]=arr[low+i];
		for(int i=0;i<n2;i++) R[i]=arr[mid+i];
		L[n1]=R[n2]=2000000000;
		int i=0,j=0;
		for(int k=low;k<high;k++){
			cnt++;
			if(L[i]<=R[j]){
				arr[k]=L[i++];
				
			}
			else{
				arr[k]=R[j++];
				res+=n1-i;
			}
		}
		return res;
	}

	public static void arrPrint(int[] arr){
		int i=0;
		for(i=0;i<arr.length-1;i++)
			System.out.print(arr[i]+" ");
		System.out.println(arr[i]);
	}
}

