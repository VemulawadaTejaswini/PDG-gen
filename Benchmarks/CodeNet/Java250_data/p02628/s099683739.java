import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
		    arr[i] = sc.nextInt();
		}
		
		System.out.println(solve(arr, k));
	}
	
	public static int solve(int[] arr, int k) {
	    int n = arr.length;
	    
	    if(n==0) {
	        return 0;
	    }
	    
	    int sum = 0;
	    
	    PriorityQueue<Integer> heap = new PriorityQueue(Collections.reverseOrder());
	    for(int i: arr) {
	        heap.add(i);
	        
	        if(heap.size() > k) {
	            heap.remove();
	        }
	    }
	    
	    while(heap.size() > 0) {
	        sum += heap.peek();
	        heap.remove();
	    }
	    return sum;
	}
}
