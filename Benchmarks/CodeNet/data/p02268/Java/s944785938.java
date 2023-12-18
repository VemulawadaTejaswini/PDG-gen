
import java.util.Scanner;

//this implements the bin search which return the position if find, otherwise negative
public class Main {
	public static int bin_search(int[] arr, int elem) {
		int lo = 0;
		int hi = arr.length-1;
		
		while(lo <= hi) {
			if(lo == hi) {
				return (arr[lo] == elem)? lo: -1; 
			}
			
			int mid =  lo + (hi - lo) /2;
			if(arr[mid]> elem) {
				hi = mid;
			}else if(arr[mid] < elem) {
				lo = mid+1;
			}else {
				return mid;
			}
			
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
			Scanner cin = new Scanner(System.in);
			int n = cin.nextInt();
			int [] S = new int[n];
			for(int i = 0; i < n; i++) {
				S[i] = cin.nextInt();
			}
			
			int  m = cin.nextInt();
			int x_i = 0;
			int count =  0;
			for(int i = 0; i < m; i++) {
				x_i = cin.nextInt();
				count += (bin_search(S, x_i) >=0)? 1:0;
			}
			
			
			System.out.println(count);
	}

}