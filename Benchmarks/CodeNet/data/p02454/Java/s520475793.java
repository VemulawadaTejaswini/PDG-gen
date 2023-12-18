import java.util.Scanner;
class Main{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int[] a = new int[n];
			for(int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			int q = sc.nextInt();

			for(int i = 0; i < q; i++) {
				int target = sc.nextInt();
				System.out.println(lowerBound(a, target) +" "+ upperBound(a, target));
			}
		}
	}
	public static int search(int[] refNums, int target) {
		int head = 0;
		int foot = refNums.length - 1;
		int result = -1;
		int mid = 0;
		while(head <= foot) {
			mid = (head + foot) / 2;
			if(refNums[mid] == target) {
				result = mid;
				break;
			}
			else if(refNums[mid] < target) {
				head = mid + 1;
			}
			else {
				foot = mid - 1;
			}
		}
		return result<0?mid:result;
	}
	public static int lowerBound(int[] refNums, int target) {
		int i = search(refNums, target);
		if(refNums[i]==target) {
			for(;i>=0&& refNums[i]==target;i--);
			i++;
		}
		else {
			for(;i < refNums.length && refNums[i]<=target;i++);
		}
		return i;
	}
	public static int upperBound(int[] refNums, int target) {
		int i = search(refNums, target);
		for(;i < refNums.length && refNums[i]<=target;i++);
		return i;
	}
}
