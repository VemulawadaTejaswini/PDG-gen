import java.util.Scanner;

public class Main{
	
	public void buildMaxHeap(int[] nums) {
		int[] heap = new int[nums.length + 1];
		heap[0] = -1;
		for(int i = 0; i < nums.length; i++)
			heap[i + 1] = nums[i];
		
		for(int i = nums.length/2; i > 0; i--)
			maxHeapify(heap, i);
		
		for(int i = 0; i < nums.length; i++)
			nums[i] = heap[i + 1];
	}
	
	public void maxHeapify(int[] nums, int index) {
		int left = getLeftIndex(index);
		int right = getRightIndex(index);
		
		int largest = index;
		if(left < nums.length && nums[left] > nums[largest])
			largest = left;
		
		if(right < nums.length && nums[right] > nums[largest])
			largest = right;
		
		if(largest != index) {
			swap(nums, index, largest);
			maxHeapify(nums, largest);
		}
	}
	
	public void swap(int[] nums, int first, int second) {
		int temp = nums[first];
		nums[first] = nums[second];
		nums[second] = temp;
	}
	
	public int getLeftIndex(int index) {
		return index * 2;
	}
	public int getRightIndex(int index) {
		return index * 2 + 1;
	}
	public int[] trim(int [] nums) {
		int[] arr = new int[nums.length - 1];
		for(int i = 0; i < arr.length; i++)
			arr[i] = nums[i + 1];
		
		return arr;
	}
	
	
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		int length = scan.nextInt();
		int[] nums = new int[length];
		
		for(int i = 0; i < length; i++)
			nums[i] = scan.nextInt();
		
		Main heap = new Main();
		heap.buildMaxHeap(nums);
		for(int i = 0; i < length; i++)
			System.out.print(" " + nums[i]);
System.out.println();
	}
}

