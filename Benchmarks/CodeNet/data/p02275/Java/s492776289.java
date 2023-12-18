import java.util.*;
public class Main {
	public static final int MAX = 10000; 
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for(int i=0;i<n;i++){
			nums[i] = sc.nextInt();
		}
		int[] temp = new int[n];
		int[] countArr = new int[MAX];
		for(int i=0;i<MAX;i++) countArr[i] = 0 ;
		for(int i=0;i<n;i++){
			countArr[nums[i]]++;
		}
		
		for(int i=1;i<MAX;i++){
			countArr[i] = countArr[i]+countArr[i-1];
		}
		for(int i=0;i<n;i++){
			temp[--countArr[nums[i]]] = nums[i];
		}
		printArr(temp);
		
		
	}
	public static void printArr(int[] nums){
		for(int i=0;i<nums.length;i++){
			if(i!=0) System.out.print(" "+nums[i]);
			else System.out.print(nums[i]);
		}
		System.out.println();
	}
}