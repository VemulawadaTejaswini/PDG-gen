import java.util.Scanner;

// https://www.codechef.com/LRNDSA04/problems/STACKS

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t > 0) {
			t--;
			int n = sc.nextInt(), ptr = -1;
			int arr[] = new int[n];
			for (int i = 0; i < n; i++) {
				int candidate = sc.nextInt();
				int pos = findPosition(arr, candidate, 0, ptr);
				if (pos != -1) {
					arr[pos] = candidate;
				}
				else {
					arr[++ptr] =  candidate;
				}
			}
			System.out.print((ptr+1) + " ");
			for (int i = 0; i <= ptr; i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
	}
	
	public static int findPosition(int arr[], int target, int low, int high) {
		int index = -1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (arr[mid] > target) {
				index = mid;
				high = mid - 1;
			}
			else {
				low = mid + 1;
			}
		}
		
		return index;
	}
}
