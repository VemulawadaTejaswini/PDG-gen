
import java.util.Scanner;

public class Main {

	static int po=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan =new Scanner(System.in);
		int n=scan.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=scan.nextInt();
		}
		po=partition1(arr, 0, n-1);
		
		arrPrint(arr);
	}

	public static int partition2(int[] arr, int low,int high){
		int x=arr[low];
		while(low<high){
			while(low<high&&arr[high]>=x) --high;
			arr[low]=arr[high];
			while(low<high&&arr[low]<=x) ++low;
			arr[high]=arr[low];
			
		}
		arr[low]=x;
		return low;
	}
	public static int partition1(int[] arr, int low,int high){
		int x=arr[high];
		int i=low-1;
		for(int j=low;j<high;j++){
			if(arr[j]<=x){
				i=i+1;
				swap(arr,i,j);
			}
		}
		swap(arr, i+1, high);
		return i+1;
	}
	
	private static void swap(int[] arr, int i,int j) {
		// TODO Auto-generated method stub
		int tmp=arr[i];
		arr[i]=arr[j];
		arr[j]=tmp;
	}
	public static void arrPrint(int[] arr){
		int i=0;
		for(i=0;i<arr.length-1;i++){
			if(i==po){
				System.out.print("["+arr[i]+"] ");
			}
			else System.out.print(arr[i]+" ");
		}
		if(po!=i){
			System.out.println(arr[i]);
		}
		else{
			System.out.println("["+arr[i]+"]");
		}
	}
}

