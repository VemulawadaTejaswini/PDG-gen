
import java.util.*;

public class Main {
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for(int i=0;i<n;i++){
			nums[i] = sc.nextInt();
		}
		int index = partition(nums,0,nums.length-1);
		for(int i=0;i<n;i++){
			if(i!=index){
				if(i!=0)System.out.print(" "+nums[i]);
				else System.out.print(nums[i]);
			}else{
				System.out.print(" ["+nums[i]+"]");
			}
		}
	}
	public static int partition(int[] A,int l,int r){
		int pivot = A[r];
		int left = l; 
		while(l<r){
			if(A[l]<pivot){
				swap(A,l,left);
				left++;
			}
			l++;
		}
		swap(A,r,left);
		return left ;
		
	}
	public static  void swap(int[] A,int i,int j){
		int tmp = A[i];
		A[i] = A[j];
		A[j] = tmp; 
	}
}