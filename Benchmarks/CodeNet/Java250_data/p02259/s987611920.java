import java.util.*;
public class Main{
	static int count = 0 ;
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums  =new int[n];
		for(int i=0;i<n;i++){
			nums[i] = sc.nextInt();
		}
		bubbleSort(nums);
		for(int i=0;i<nums.length;i++){
			if(i>0) System.out.print(" ");
			System.out.print(nums[i]);
		}
		System.out.println();
		System.out.println(count);
	}
	public static void bubbleSort(int[] A){
		int N = A.length;
		for(int i=0;i<N;i++){
			for(int j=1;j<N-i;j++){
				if(A[j]<A[j-1]){
					count++;
					int t = A[j];
					A[j] = A[j-1];
					A[j-1] = t; 
				}
			}
		}
	}
}